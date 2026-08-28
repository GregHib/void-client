package io

import kotlinx.coroutines.suspendCancellableCoroutine
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Int8Array
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

private fun ArrayBuffer.toByteArray(): ByteArray = Int8Array(this).unsafeCast<ByteArray>()

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

    suspend fun getAll(): Map<String, ByteArray> {
        val store = database().transaction(STORE_NAME, "readonly").objectStore(STORE_NAME)
        return suspendCancellableCoroutine { cont ->
            val request = store.getAll()
            request.onsuccess = {
                val records: dynamic = request.result
                val length: Int = records.length as Int
                val result = HashMap<String, ByteArray>(length)
                for (i in 0 until length) {
                    val record = records[i]
                    val path = record.path as String
                    val buffer = record.bytes as ArrayBuffer
                    result[path] = buffer.toByteArray()
                }
                cont.resume(result)
            }
            request.onerror = { cont.resumeWithException(RuntimeException("IndexedDB getAll failed")) }
        }
    }

    suspend fun put(path: String, bytes: ByteArray) {
        val store = database().transaction(STORE_NAME, "readwrite").objectStore(STORE_NAME)
        suspendCancellableCoroutine<Unit> { cont ->
            val view = bytes.asUint8Array()
            val buffer = view.buffer.slice(view.byteOffset, view.byteOffset + view.length)
            val record = js("({})")
            record.path = path
            record.bytes = buffer
            val request = store.put(record)
            request.onsuccess = { cont.resume(Unit) }
            request.onerror = { cont.resumeWithException(RuntimeException("IndexedDB put failed for $path")) }
        }
    }

    suspend fun delete(path: String) {
        val store = database().transaction(STORE_NAME, "readwrite").objectStore(STORE_NAME)
        suspendCancellableCoroutine<Unit> { cont ->
            val request = store.delete(path)
            request.onsuccess = { cont.resume(Unit) }
            request.onerror = { cont.resumeWithException(RuntimeException("IndexedDB delete failed for $path")) }
        }
    }
}
