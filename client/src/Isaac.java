/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Isaac {
    private static final int GOLDEN_RATIO = 0x9E3779B9;

    private static final int SIZE_LOG = 8;

    private static final int SIZE = 1 << SIZE_LOG;

    private static final int STEP = 8;

    private int last;

    private int count;

    private int[] results;

    private int[] memory;

    private int accumulator;

    private int counter;

    static int anInt1290 = 0;
    static Class273 aClass273_1298 = new Class273("", 16);
    static int[] anIntArray1303;

    private Isaac() {
        /* empty */
    }

    Isaac(int[] seed) {
        this.memory = new int[SIZE];
        this.results = new int[SIZE];
        for (int i = 0; seed.length > i; i++) {
            this.results[i] = seed[i];
        }
        init();
    }

    private void init() {
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int a = b = c = d = e = f = g = h = GOLDEN_RATIO;
        for (int i = 0; i < 4; i++) {
            a ^= b << 11;
            d += a;
            b += c;

            b ^= c >>> 2;
            e += b;
            c += d;

            c ^= d << 8;
            d += e;
            f += c;

            d ^= e >>> 16;
            g += d;
            e += f;

            e ^= f << 10;
            f += g;
            h += e;

            f ^= g >>> 4;
            a += f;
            g += h;

            g ^= h << 8;
            b += g;
            h += a;

            h ^= a >>> 9;
            a += b;
            c += h;
        }
        for (int i = 0; i < SIZE; i += STEP) {
            a += this.results[i];
            b += this.results[i + 1];
            c += this.results[i + 2];
            d += this.results[i + 3];
            e += this.results[i + 4];
            f += this.results[i + 5];
            g += this.results[i + 6];
            h += this.results[i + 7];

            a ^= b << 11;
            b += c;
            d += a;

            b ^= c >>> 2;
            c += d;
            e += b;

            c ^= d << 8;
            f += c;
            d += e;

            d ^= e >>> 16;
            g += d;
            e += f;

            e ^= f << 10;
            h += e;
            f += g;

            f ^= g >>> 4;
            g += h;
            a += f;

            g ^= h << 8;
            h += a;
            b += g;

            h ^= a >>> 9;
            c += h;
            a += b;

            this.memory[i] = a;
            this.memory[i + 1] = b;
            this.memory[i + 2] = c;
            this.memory[i + 3] = d;
            this.memory[i + 4] = e;
            this.memory[i + 5] = f;
            this.memory[i + 6] = g;
            this.memory[i + 7] = h;
        }
        int i = 0;
        for (/**/; i < SIZE; i += STEP) {
            a += this.memory[i];
            b += this.memory[i + 1];
            c += this.memory[i + 2];
            d += this.memory[i + 3];
            e += this.memory[i + 4];
            f += this.memory[i + 5];
            g += this.memory[i + 6];
            h += this.memory[i + 7];

            a ^= b << 11;
            d += a;
            b += c;

            b ^= c >>> 2;
            e += b;
            c += d;

            c ^= d << 8;
            f += c;
            d += e;

            d ^= e >>> 16;
            g += d;
            e += f;

            e ^= f << 10;
            f += g;
            h += e;

            f ^= g >>> 4;
            g += h;
            a += f;

            g ^= h << 8;
            b += g;
            h += a;

            h ^= a >>> 9;
            c += h;
            a += b;

            this.memory[i] = a;
            this.memory[i + 1] = b;
            this.memory[i + 2] = c;
            this.memory[i + 3] = d;
            this.memory[i + 4] = e;
            this.memory[i + 5] = f;
            this.memory[i + 6] = g;
            this.memory[i + 7] = h;
        }
        this.isaac();
        this.count = SIZE;
    }

    public int next() {
        if (this.count == 0) {
            this.isaac();
            this.count = SIZE;
        }
        return this.results[count - 1];
    }

    private void isaac() {
        this.last += ++this.counter;

        for (int i = 0; i < SIZE; i++) {
            int x = this.memory[i];

            if ((i & 0x2) != 0) {
                if ((0x1 & i) == 0) {
                    this.accumulator ^= this.accumulator << 2;
                }
                else {
                    this.accumulator ^= this.accumulator >>> 16;
                }
            }
            else if ((0x1 & i) != 0) {
                this.accumulator ^= this.accumulator >>> 6;
            }
            else {
                this.accumulator ^= this.accumulator << 13;
            }

            this.accumulator += this.memory[0xff & 128 + i];
            int y;
            this.memory[i] = y = (this.memory[(x >> 2) & 0xFF] + this.accumulator + this.last);
            this.results[i] = this.last = x + this.memory[(y >> 8 >> 2) & 0xFF];
        }
    }

    public int peek() {
        if (this.count == 0) {
            this.isaac();
            this.count = SIZE;
        }

        return this.results[--count];
    }

    static boolean method780(int i, int i_15_, int i_16_) {
        if (i_15_ != 0) return true;
        return (0x400 & i_16_) != 0;
    }

    public static void method782(int i) {
        anIntArray1303 = null;
        if (i != 1) anInt1290 = 114;
        aClass273_1298 = null;
    }

    static final boolean method776(int i, int i_0_, int i_1_) {
        if (i_1_ != 65536) method780(-106, -24, 57);
        boolean bool = ((i & 0x37) != 0 ? Class126.method1113(i_0_, i, -7) : Class348_Sub42_Sub8_Sub2.method3200(i_0_, i, (byte) 111));
        return bool | (Class274.method2058(i_0_, i, i_1_ ^ 0x1003d) | (0x10000 & i_0_) != 0);
    }
}
