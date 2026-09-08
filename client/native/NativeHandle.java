/* NativeHandle - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * NativeHandle — wrapper JNI para handle nativo (antigo `NativeHandle`).
 * <p>
 * Estende {@code NodeBase} (abstração de recurso nativo) e expõe um ponteiro
 * {@code nativeid} gerenciado em C++. Cada instância corresponde a um
 * objeto nativo alocado via {@code Shader(OpenGLToolkit, int)} e liberado em
 * {@code finalize()} → {@code Component36.method1947}. Os métodos nativos
 * curtos {@code w}, {@code ga}, {@code r} são delegações diretas para
 * o lado nativo (render/áudio/input dependendo do subtipo {@code OpenGLToolkit}).
 * <p>
 * Renomeado de `NativeHandle` (nome ofuscado) para `NativeHandle` com base em:
 * campo {@code long nativeid} + métodos {@code native} + {@code finalize}
 * que libera o handle.
 */
/**
 * RENAMED from `NativeHandle` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */
final class NativeHandle extends NodeBase implements Interface19 {
    /** Ponteiro opaco para o objeto nativo (0 = não alocado/liberado). */
    long nativeid;

    /** Libera/invalida o handle nativo; bool controla flush síncrono. */
    public final native void w(boolean bool);

    /** Inicializa/liga o handle no lado nativo (chamado após construção). */
    final native void ga();

    @Override
    protected final void finalize() {
        if (this.nativeid != 0L) Component36.method1947(0, this);
    }

    /** Aloca o objeto nativo associado a {@code var_oa} com tipo {@code i}. */
    private final native void Shader(OpenGLToolkit var_oa, int i);

    /** Reseta/libera recurso nativo sem destruir o wrapper Java. */
    final native void r();

    NativeHandle(OpenGLToolkit var_oa, int i) {
        Shader(var_oa, i);
    }
}
