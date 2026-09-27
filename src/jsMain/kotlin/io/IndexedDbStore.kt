package io

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.js.unsafeCast

private const val DB_NAME = "void-client-cache"
private const val DB_VERSION = 1
private const val STORE_NAME = "files"

/**
 * org.w3c.dom.indexeddb isn't part of kotlin-dom-api-compat (only the classic org.w3c.dom.* set
 * survived the stdlib split - indexeddb never made it into the compat artifact), so this declares
 * just the handful of IndexedDB members MemFs persistence needs as external interfaces over the
 * browser's real `indexedDB` global.
 */
private external interface IDBRequest {
    val result: dynamic
    var onsuccess: ((dynamic) -> Unit)?
    var onerror: ((dynamic) -> Unit)?
}

private external interface IDBOpenDBRequest : IDBRequest {
    var onupgradeneeded: ((dynamic) -> Unit)?
}

private external interface IDBObjectStore {
    fun put(value: dynamic): IDBRequest
    fun delete(key: dynamic): IDBRequest
    fun getAll(): IDBRequest
}

private external interface IDBTransaction {
    fun objectStore(name: String): IDBObjectStore
}

private external interface IDBDatabase {
    fun transaction(storeNames: String, mode: String): IDBTransaction
    fun createObjectStore(name: String, options: dynamic): IDBObjectStore
    val objectStoreNames: dynamic
}

private external interface IDBFactory {
    fun open(name: String, version: Int): IDBOpenDBRequest
}

private fun indexedDbFactory(): IDBFactory = js("window.indexedDB")

/** Coroutine wrapper around the browser's IndexedDB, storing one record per [MemFs] path. */
internal object IndexedDbStore {
    private var db: IDBDatabase? = null

    private suspend fun database(): IDBDatabase {
        db?.let { return it }
        val opened = suspendCancellableCoroutine<IDBDatabase> { cont ->
            val request = indexedDbFactory().open(DB_NAME, DB_VERSION)
            request.onupgradeneeded = {
                val database = request.result.unsafeCast<IDBDatabase>()
                val stores: dynamic = database.objectStoreNames
                if (stores.contains(STORE_NAME) != true) {
                    database.createObjectStore(STORE_NAME, js("({ keyPath: 'path' })"))
                }
            }
            request.onsuccess = { cont.resume(request.result.unsafeCast<IDBDatabase>()) }
            request.onerror = { cont.resumeWithException(RuntimeException("IndexedDB open failed: $DB_NAME")) }
        }
        db = opened
        return opened
    }

    /** Every stored record, as the plain objects [put] wrote. */
    suspend fun getAll(): Array<dynamic> {
        val store = database().transaction(STORE_NAME, "readonly").objectStore(STORE_NAME)
        return suspendCancellableCoroutine { cont ->
            val request = store.getAll()
            request.onsuccess = { cont.resume(request.result.unsafeCast<Array<dynamic>>()) }
            request.onerror = { cont.resumeWithException(RuntimeException("IndexedDB getAll failed")) }
        }
    }

    /** Stores [record], keyed by its `path` field. */
    suspend fun put(record: dynamic) {
        val store = database().transaction(STORE_NAME, "readwrite").objectStore(STORE_NAME)
        suspendCancellableCoroutine<Unit> { cont ->
            val request = store.put(record)
            request.onsuccess = { cont.resume(Unit) }
            request.onerror = { cont.resumeWithException(RuntimeException("IndexedDB put failed for ${record.path}")) }
        }
    }

    suspend fun delete(key: String) = delete(key, key)

    /** Deletes every record whose key lies in [lower]..[upper]. */
    suspend fun delete(lower: String, upper: String) {
        val store = database().transaction(STORE_NAME, "readwrite").objectStore(STORE_NAME)
        suspendCancellableCoroutine<Unit> { cont ->
            val range: dynamic = js("IDBKeyRange").bound(lower, upper)
            val request = store.delete(range)
            request.onsuccess = { cont.resume(Unit) }
            request.onerror = { cont.resumeWithException(RuntimeException("IndexedDB delete failed for $lower")) }
        }
    }
}
