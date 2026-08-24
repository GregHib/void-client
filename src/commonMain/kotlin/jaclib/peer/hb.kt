package jaclib.peer

import java.lang.ref.ReferenceQueue


class hb {
    private var b: PeerReference? = null

    private var c: PeerReference? = null

    val a: ReferenceQueue<Any?> = ReferenceQueue<Any?>()

    fun a(arg0: Byte) {
        this.a(21492)
        while (this.b != null) {
            this.a(19236, this.b!!)
        }
        this.a(21492)
    }

    fun a(arg0: PeerReference, arg1: Int) {
        arg0.a = this.b
        arg0.b = null
        if (this.c == null) {
            this.c = arg0
        } else {
            this.b!!.b = arg0
        }
        this.b = arg0
    }

    private fun a(arg0: Int) {
        while (true) {
            val local3 = this.a.poll()
            if (local3 == null) {
                return
            }
            val local9 = local3 as PeerReference
            this.a(19236, local9)
        }
    }

    fun b(arg0: Byte) {
        this.a(arg0 + 21574)
    }

    private fun a(arg0: Int, arg1: PeerReference) {
        arg1.a(false)
        if (arg1 === this.b) {
            this.b = arg1.a
        }
        if (this.c === arg1) {
            this.c = arg1.b
        }
        if (arg1.b != null) {
            arg1.b?.a = arg1.a
        }
        if (arg1.a != null) {
            arg1.a?.b = arg1.b
        }
    }
}
