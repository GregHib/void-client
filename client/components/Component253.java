/* Component253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Component253
/**
 * RENAMED from {@code Class248} (JODE-obfuscated).
 * JS5-over-TCP on-demand client: queues archive requests (priority opcode 1 /
 * normal opcode 0), reads 8-byte headers + 512-byte blocks, optional XOR cipher.
 * Handshake opcode 6; login-state opcodes 2/3; close opcode 7; rekey opcode 4.
 */ {
    static int anInt3185;
    static int anInt3186;
    static int anInt3187;
    static int anInt3188;
    static int anInt3189;
    static int anInt3190;
    static int anInt3191;
    static int anInt3192;
    static int anInt3193;
    static int anInt3194;
    static int anInt3195;
    static Component267 aClass229_3196 = new Component267();
    /** Priority requests not yet written (opcode 1). */
    private final HashTable pendingPriority = new HashTable();
    static int anInt3198;
    static int anInt3199;
    static int anInt3200;
    static int anInt3201;
    static int anInt3202;
    static int anInt3203 = -1;
    /** Priority requests written, awaiting response. */
    private final HashTable sentPriority = new HashTable();
    /** Normal requests not yet written (opcode 0). */
    private final HashTable pendingNormal = new HashTable();
    /** Normal requests written, awaiting response. */
    private final HashTable sentNormal = new HashTable();
    /** Wall-clock ms of last successful IO (idle timeout). */
    private long lastIoMillis;
    /** 4-byte outbound scratch for control opcodes. */
    private final Buffer outBuffer = new Buffer(4);
    /** Live socket connection, or null when disconnected. */
    private Connection connection;
    /** Accumulated idle ms since last bytes; disconnect past 90s. */
    private int idleMillis;
    /** 8-byte inbound header buffer (index/archive/flags/length). */
    private final Buffer headerBuffer;
    /** Per-connection XOR key applied to inbound bytes when non-zero. */
    private byte xorKey = 0;
    /** Count of IO failures / forced reconnects. */
    volatile int errorCount = 0;
    /** Last disconnect reason code ({@code -2} = IO error). */
    volatile int disconnectCode = 0;
    /** In-flight archive response currently being filled. */
    private HashNodeSub16Sub1 currentResponse;

    /**
     * Writes login-state opcode: {@code 2} if logged in, {@code 3} otherwise.
     */
    final void writeLoginState(int i, boolean bool) {
        anInt3194++;
        if (connection != null) {
            try {
                outBuffer.offset = 0;
                outBuffer.writeByte(false, bool ? 2 : 3);
                outBuffer.writeMedium(-9912, 0);
                if (i < -66) connection.write((outBuffer.payload), 4, 0, -1);
            } catch (IOException ioexception) {
                try {
                    connection.close((byte) -121);
                } catch (Exception exception) {
                    /* empty */
                }
                this.errorCount++;
                connection = null;
                this.disconnectCode = -2;
            }
        }
    }

    /** Pulse: flush queued requests, read headers/blocks, enforce 90s idle timeout. */
    final boolean process(byte i) {
        if (connection != null) {
            long l = Component240.currentTimeMillis(-106);
            int i_0_ = (int) (-lastIoMillis + l);
            if (i_0_ > 200) i_0_ = 200;
            lastIoMillis = l;
            idleMillis += i_0_;
            if (idleMillis > 90000) {
                try {
                    connection.close((byte) -121);
                } catch (Exception exception) {
                    /* empty */
                }
                connection = null;
            }
        }
        anInt3190++;
        if (connection == null) {
            return priorityQueueSize(4) == 0 && normalQueueSize(4350) == 0;
        }
        try {
            connection.checkError(true);
            for (HashNodeSub16Sub1 class348_sub42_sub16_sub1 = ((HashNodeSub16Sub1) pendingPriority.first(-30)); class348_sub42_sub16_sub1 != null; class348_sub42_sub16_sub1 = ((HashNodeSub16Sub1) pendingPriority.next((byte) 65))) {
                outBuffer.offset = 0;
                outBuffer.writeByte(false, 1);
                outBuffer.writeMedium(-9912, (int) (class348_sub42_sub16_sub1.accessAge));
                connection.write((outBuffer.payload), 4, 0, -1);
                sentPriority.add(true, class348_sub42_sub16_sub1);
            }
            HashNodeSub16Sub1 class348_sub42_sub16_sub1 = (HashNodeSub16Sub1) pendingNormal.first(-75);
            if (i <= 72) return false;
            for (/**/; class348_sub42_sub16_sub1 != null; class348_sub42_sub16_sub1 = ((HashNodeSub16Sub1) pendingNormal.next((byte) 102))) {
                outBuffer.offset = 0;
                outBuffer.writeByte(false, 0);
                outBuffer.writeMedium(-9912, (int) (class348_sub42_sub16_sub1.accessAge));
                connection.write((outBuffer.payload), 4, 0, -1);
                sentNormal.add(true, class348_sub42_sub16_sub1);
            }
            for (int i_1_ = 0; i_1_ < 100; i_1_++) {
                int i_2_ = connection.available((byte) 83);
                if (i_2_ < 0) throw new IOException();
                if (i_2_ == 0) break;
                idleMillis = 0;
                int i_3_ = 0;
                if (currentResponse == null) i_3_ = 8;
                else if (currentResponse.blockPosition == 0) i_3_ = 1;
                if (i_3_ <= 0) {
                    int i_4_ = (currentResponse.buffer.payload.length + -currentResponse.padding);
                    int i_5_ = (-currentResponse.blockPosition + 512);
                    if (i_5_ > -(currentResponse.buffer.offset) + i_4_) i_5_ = i_4_ - currentResponse.buffer.offset;
                    if (i_2_ < i_5_) i_5_ = i_2_;
                    connection.readFully((currentResponse.buffer.payload), currentResponse.buffer.offset, (byte) -72, i_5_);
                    if (xorKey != 0) {
                        for (int i_6_ = 0; i_5_ > i_6_; i_6_++)
                            currentResponse.buffer.payload[i_6_ + currentResponse.buffer.offset] = (byte) (NodeSub21.bitwiseXor((currentResponse.buffer.payload[(i_6_ + (currentResponse.buffer.offset))]), xorKey));
                    }
                    currentResponse.blockPosition += i_5_;
                    currentResponse.buffer.offset += i_5_;
                    if (i_4_ == currentResponse.buffer.offset) {
                        currentResponse.unlink(true);
                        currentResponse.incomplete = false;
                        currentResponse = null;
                    } else if (currentResponse.blockPosition == 512) currentResponse.blockPosition = 0;
                } else {
                    int i_7_ = i_3_ + -(headerBuffer.offset);
                    if (i_2_ < i_7_) i_7_ = i_2_;
                    connection.readFully((headerBuffer.payload), headerBuffer.offset, (byte) -72, i_7_);
                    if (xorKey != 0) {
                        for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
                            headerBuffer.payload[i_8_ + headerBuffer.offset] = (byte) (NodeSub21.bitwiseXor((headerBuffer.payload[i_8_ + (headerBuffer.offset)]), xorKey));
                    }
                    headerBuffer.offset += i_7_;
                    if (headerBuffer.offset >= i_3_) {
                        if (currentResponse == null) {
                            headerBuffer.offset = 0;
                            int i_9_ = headerBuffer.readUnsignedByte(255);
                            int i_10_ = headerBuffer.readUnsignedShort(842397944);
                            int i_11_ = headerBuffer.readUnsignedByte(255);
                            int i_12_ = headerBuffer.readInt((byte) -126);
                            int i_13_ = 0x7f & i_11_;
                            boolean bool = (0x80 & i_11_) != 0;
                            long l = (i_9_ << 16) + i_10_;
                            Object object = null;
                            HashNodeSub16Sub1 class348_sub42_sub16_sub1_14_;
                            if (bool) {
                                for (class348_sub42_sub16_sub1_14_ = ((HashNodeSub16Sub1) sentNormal.first(-89)); class348_sub42_sub16_sub1_14_ != null; class348_sub42_sub16_sub1_14_ = ((HashNodeSub16Sub1) sentNormal.next((byte) 98))) {
                                    if (l == (class348_sub42_sub16_sub1_14_.accessAge)) break;
                                }
                            } else {
                                for (class348_sub42_sub16_sub1_14_ = ((HashNodeSub16Sub1) sentPriority.first(-108)); class348_sub42_sub16_sub1_14_ != null; class348_sub42_sub16_sub1_14_ = ((HashNodeSub16Sub1) sentPriority.next((byte) 90))) {
                                    if (l == (class348_sub42_sub16_sub1_14_.accessAge)) break;
                                }
                            }
                            if (class348_sub42_sub16_sub1_14_ == null) throw new IOException();
                            int i_15_ = i_13_ == 0 ? 5 : 9;
                            currentResponse = class348_sub42_sub16_sub1_14_;
                            currentResponse.buffer = (new Buffer((currentResponse.padding) + i_15_ + i_12_));
                            currentResponse.buffer.writeByte(false, i_13_);
                            currentResponse.buffer.writeInt((byte) 97, i_12_);
                            headerBuffer.offset = 0;
                            currentResponse.blockPosition = 8;
                        } else if ((currentResponse.blockPosition) == 0) {
                            if ((headerBuffer.payload[0]) == -1) {
                                currentResponse.blockPosition = 1;
                                headerBuffer.offset = 0;
                            } else currentResponse = null;
                        } else throw new IOException();
                    }
                }
            }
            return true;
        } catch (IOException ioexception) {
            try {
                connection.close((byte) -122);
            } catch (Exception exception) {
                /* empty */
            }
            this.disconnectCode = -2;
            this.errorCount++;
            connection = null;
            return priorityQueueSize(4) == 0 && normalQueueSize(4350) == 0;
        }
    }

    /** Size of pending+sent normal (opcode 0) request queues. */
    private final int normalQueueSize(int i) {
        anInt3199++;
        if (i != 4350) return 29;
        return pendingNormal.size(0) - -sentNormal.size(0);
    }

    static final void method1895(int i, byte[] is, int i_16_, int i_17_, int i_18_, int i_19_, byte[] is_20_, int i_21_, byte i_22_) {
        try {
            anInt3198++;
            int i_23_ = -(i_21_ >> 2);
            i_21_ = -(0x3 & i_21_);
            if (i_22_ != 121) aClass229_3196 = null;
            for (int i_24_ = -i_16_; i_24_ < 0; i_24_++) {
                for (int i_25_ = i_23_; i_25_ < 0; i_25_++) {
                    is[i_17_++] += -is_20_[i++];
                    is[i_17_++] += -is_20_[i++];
                    is[i_17_++] += -is_20_[i++];
                    is[i_17_++] += -is_20_[i++];
                }
                for (int i_26_ = i_21_; i_26_ < 0; i_26_++)
                    is[i_17_++] += -is_20_[i++];
                i_17_ += i_18_;
                i += i_19_;
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("tha.M(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (is_20_ != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ')'));
        }
    }

    /** Writes JS5 handshake opcode 6. */
    private final void writeHandshake(int i) {
        if (i <= -58) {
            anInt3191++;
            if (connection != null) {
                try {
                    outBuffer.offset = 0;
                    outBuffer.writeByte(false, 6);
                    outBuffer.writeMedium(-9912, 3);
                    connection.write((outBuffer.payload), 4, 0, -1);
                } catch (IOException ioexception) {
                    try {
                        connection.close((byte) -123);
                    } catch (Exception exception) {
                        /* empty */
                    }
                    this.disconnectCode = -2;
                    connection = null;
                    this.errorCount++;
                }
            }
        }
    }

    /** Nulls static scratch at shutdown. */
    public static void clearStatics(byte i) {
        if (i == 119) aClass229_3196 = null;
    }

    /** Replaces live streams with discard stubs via {@link Connection#detachStreams}. */
    final void detachStreams(boolean bool) {
        if (connection != null) connection.detachStreams(72);
        if (bool != true) forceDisconnect(99);
        anInt3185++;
    }

    /** True when normal queue size ≥ 48. */
    final boolean isNormalQueueFull(int i) {
        if (i > -91) this.disconnectCode = -39;
        anInt3186++;
        return normalQueueSize(4350) >= 48;
    }

    /** True when priority queue size ≥ 48. */
    final boolean isPriorityQueueFull(int i) {
        int i_27_ = -51 % ((41 - i) / 47);
        anInt3195++;
        return priorityQueueSize(4) >= 48;
    }

    /** Closes the socket connection if present. */
    final void closeConnection(int i) {
        if (i > -27) closeConnection(21);
        if (connection != null) connection.close((byte) -122);
        anInt3200++;
    }

    /** Size of pending+sent priority (opcode 1) request queues. */
    final int priorityQueueSize(int i) {
        anInt3192++;
        if (i != 4) this.errorCount = 18;
        return pendingPriority.size(0) + sentPriority.size(0);
    }

    /** Swap connection, handshake, restore unsent queues, optional XOR rekey (opcode 4). */
    final void setConnection(boolean bool, boolean bool_28_, Connection class202) {
        if (connection != null) {
            try {
                connection.close((byte) -124);
            } catch (Exception exception) {
                /* empty */
            }
            connection = null;
        }
        anInt3193++;
        connection = class202;
        writeHandshake(-92);
        writeLoginState(-92, bool_28_);
        headerBuffer.offset = 0;
        currentResponse = null;
        if (bool != false) lastIoMillis = -35L;
        for (; ; ) {
            HashNodeSub16Sub1 class348_sub42_sub16_sub1 = (HashNodeSub16Sub1) sentPriority.removeHead(20);
            if (class348_sub42_sub16_sub1 == null) break;
            pendingPriority.add(true, class348_sub42_sub16_sub1);
        }
        for (; ; ) {
            HashNodeSub16Sub1 class348_sub42_sub16_sub1 = (HashNodeSub16Sub1) sentNormal.removeHead(20);
            if (class348_sub42_sub16_sub1 == null) break;
            pendingNormal.add(!bool, class348_sub42_sub16_sub1);
        }
        if (xorKey != 0) {
            try {
                outBuffer.offset = 0;
                outBuffer.writeByte(bool, 4);
                outBuffer.writeByte(bool, xorKey);
                outBuffer.writeShort((byte) 107, 0);
                connection.write((outBuffer.payload), 4, 0, -1);
            } catch (IOException ioexception) {
                try {
                    connection.close((byte) -126);
                } catch (Exception exception) {
                    /* empty */
                }
                this.disconnectCode = -2;
                this.errorCount++;
                connection = null;
            }
        }
        idleMillis = 0;
        lastIoMillis = Component240.currentTimeMillis(-105);
    }

    /** Force-close and pick a new random XOR key for the next connection. */
    final void forceDisconnect(int i) {
        try {
            connection.close((byte) -123);
        } catch (Exception exception) {
            /* empty */
        }
        anInt3189++;
        connection = null;
        this.errorCount++;
        xorKey = (byte) (int) (Math.random() * 255.0 + 1.0);
        this.disconnectCode = i;
    }

    /** Writes JS5 close opcode 7. */
    final void writeClose(int i) {
        anInt3188++;
        if (connection != null) {
            try {
                outBuffer.offset = i;
                outBuffer.writeByte(false, 7);
                outBuffer.writeMedium(-9912, 0);
                connection.write((outBuffer.payload), 4, 0, ~i);
            } catch (IOException ioexception) {
                try {
                    connection.close((byte) -125);
                } catch (Exception exception) {
                    /* empty */
                }
                this.disconnectCode = -2;
                this.errorCount++;
                connection = null;
            }
        }
    }

    /** Enqueue archive request ({@code bool}=priority). Key is {@code (index<<16)|archive}. */
    final HashNodeSub16Sub1 queueRequest(byte i, byte i_29_, boolean bool, int i_30_, int i_31_) {
        anInt3187++;
        int i_32_ = -118 % ((i - -15) / 61);
        long l = (i_31_ << 16) - -i_30_;
        HashNodeSub16Sub1 class348_sub42_sub16_sub1 = new HashNodeSub16Sub1();
        class348_sub42_sub16_sub1.priority = bool;
        class348_sub42_sub16_sub1.accessAge = l;
        class348_sub42_sub16_sub1.padding = i_29_;
        if (bool) {
            if (priorityQueueSize(4) >= 48) throw new RuntimeException();
            pendingPriority.add(true, class348_sub42_sub16_sub1);
        } else {
            if (normalQueueSize(4350) >= 48) throw new RuntimeException();
            pendingNormal.add(true, class348_sub42_sub16_sub1);
        }
        return class348_sub42_sub16_sub1;
    }

    public Component253() {
        headerBuffer = new Buffer(8);
    }
}
