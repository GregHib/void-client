/* d - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

interface d
/**
 * ModelProvider contract (JODE-obfuscated name `d`).
 * Evidence: interface (no impl); used as type.
 * Methods were deobfuscated (lote 50): getVertices / getModelCount /
 * getModel / isModelLoaded / getTriangles / getIndices.
 * The interface NAME `d` is intentionally LEFT as-is for now — a
 * single-letter identifier cannot be safely renamed by regex (it
 * collides with hundreds of local `d` variables); rename it with a
 * real IDE refactor in a dedicated pass.
 */ {
    float[] getVertices(int i, float f, boolean bool, int i_0_, int i_1_, int i_2_);

    int getModelCount(boolean bool);

    Model getModel(int i, int i_3_);

    boolean isModelLoaded(int i, int i_4_);

    int[] getTriangles(boolean bool, int i, float f, int i_5_, int i_6_, int i_7_);

    int[] getIndices(int i, int i_8_, float f, int i_9_, boolean bool, int i_10_);
}
