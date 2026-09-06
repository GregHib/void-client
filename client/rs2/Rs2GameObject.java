/**
 * Scene object interact — scans tile nodes for {@link Interface10}, resolves
 * {@link ObjectDefinition} via {@link GradientPreset#aClass263_9195}.
 */
final class Rs2GameObject {

    private static final int[] OBJECT_OPCODES = {3, 4, 9, 59, 1007};

    private Rs2GameObject() {
    }

    static boolean interactNearest(String objectName, String action) {
        SceneObjectHit hit = findNearest(objectName);
        return hit != null && interact(hit, action);
    }

    static boolean interact(SceneObjectHit hit, String action) {
        if (hit == null || hit.def == null || hit.iface == null) {
            return false;
        }
        String act = action;
        int opcode = opcodeFor(hit.def, act);
        if (opcode <= 0 && hit.def.aStringArray913 != null) {
            for (int i = 0; i < hit.def.aStringArray913.length && i < OBJECT_OPCODES.length; i++) {
                if (hit.def.aStringArray913[i] != null) {
                    opcode = OBJECT_OPCODES[i];
                    act = hit.def.aStringArray913[i];
                    break;
                }
            }
        }
        if (opcode <= 0) {
            return false;
        }
        long packed = DefinitionSub21.method3107((byte) 95, hit.iface, hit.localY, hit.localX);
        String target = "<col=00ffff>" + (hit.def.aString884 != null ? hit.def.aString884 : "");
        NewMenuEntry entry = new NewMenuEntry(act, target, opcode, packed, hit.localX, hit.localY, -1);
        Microbot.doInvoke(entry);
        return true;
    }

    static SceneObjectHit findNearest(String name) {
        if (Component335.aClass357ArrayArrayArray2029 == null || Component72.localPlayer == null) {
            return null;
        }
        int plane = Component72.localPlayer.plane;
        if (plane < 0 || plane >= Component335.aClass357ArrayArrayArray2029.length) {
            return null;
        }
        Component186[][] layer = Component335.aClass357ArrayArrayArray2029[plane];
        if (layer == null) {
            return null;
        }
        SceneObjectHit best = null;
        int bestDist = Integer.MAX_VALUE;
        int px = Component72.localPlayer.anIntArray10320[0];
        int py = Component72.localPlayer.anIntArray10317[0];
        int minX = Math.max(0, px - 20);
        int maxX = Math.min(layer.length - 1, px + 20);
        for (int x = minX; x <= maxX; x++) {
            Component186[] col = layer[x];
            if (col == null) {
                continue;
            }
            int minY = Math.max(0, py - 20);
            int maxY = Math.min(col.length - 1, py + 20);
            for (int y = minY; y <= maxY; y++) {
                Component186 tile = col[y];
                if (tile == null) {
                    continue;
                }
                best = closer(best, bestDist, hitFromNode(tile.aClass318_Sub1_Sub1_4402, name, x, y, plane), px, py);
                if (best != null) {
                    bestDist = Math.max(Math.abs(best.localX - px), Math.abs(best.localY - py));
                }
                SceneObjectHit h;
                h = hitFromNode(tile.aClass318_Sub1_Sub4_4403, name, x, y, plane);
                if (h != null) {
                    int d = Math.max(Math.abs(x - px), Math.abs(y - py));
                    if (d < bestDist) {
                        bestDist = d;
                        best = h;
                    }
                }
                h = hitFromNode(tile.aClass318_Sub1_Sub4_4406, name, x, y, plane);
                if (h != null) {
                    int d = Math.max(Math.abs(x - px), Math.abs(y - py));
                    if (d < bestDist) {
                        bestDist = d;
                        best = h;
                    }
                }
                h = hitFromNode(tile.aClass318_Sub1_Sub5_4395, name, x, y, plane);
                if (h != null) {
                    int d = Math.max(Math.abs(x - px), Math.abs(y - py));
                    if (d < bestDist) {
                        bestDist = d;
                        best = h;
                    }
                }
                h = hitFromNode(tile.aClass318_Sub1_Sub5_4407, name, x, y, plane);
                if (h != null) {
                    int d = Math.max(Math.abs(x - px), Math.abs(y - py));
                    if (d < bestDist) {
                        bestDist = d;
                        best = h;
                    }
                }
                h = hitFromNode(tile.aClass318_Sub1_Sub2_4408, name, x, y, plane);
                if (h != null) {
                    int d = Math.max(Math.abs(x - px), Math.abs(y - py));
                    if (d < bestDist) {
                        bestDist = d;
                        best = h;
                    }
                }
                for (Component3 link = tile.aClass148_4396; link != null; link = link.aClass148_2038) {
                    h = hitFromNode(link.aClass318_Sub1_Sub3_2040, name, x, y, plane);
                    if (h != null) {
                        int d = Math.max(Math.abs(x - px), Math.abs(y - py));
                        if (d < bestDist) {
                            bestDist = d;
                            best = h;
                        }
                    }
                }
            }
        }
        return best;
    }

    private static SceneObjectHit closer(SceneObjectHit best, int bestDist, SceneObjectHit h, int px, int py) {
        if (h == null) {
            return best;
        }
        int d = Math.max(Math.abs(h.localX - px), Math.abs(h.localY - py));
        return d < bestDist ? h : best;
    }

    private static SceneObjectHit hitFromNode(Object node, String name, int x, int y, int plane) {
        if (!(node instanceof Interface10)) {
            return null;
        }
        Interface10 iface = (Interface10) node;
        try {
            ObjectDefinition def = GradientPreset.aClass263_9195.getObjectDefinition(0, iface.method42(-100));
            if (def == null) {
                return null;
            }
            if (def.anIntArray945 != null) {
                def = def.getTransformedDefinition(DisplayModeManagerContainer58.aClass170_10209, (byte) 47);
                if (def == null) {
                    return null;
                }
            }
            String oname = def.aString884;
            if (name != null && (oname == null || oname.toLowerCase().indexOf(name.toLowerCase()) < 0)) {
                return null;
            }
            return new SceneObjectHit(def, iface, x, y, plane);
        } catch (Throwable t) {
            return null;
        }
    }

    private static int opcodeFor(ObjectDefinition def, String action) {
        if (def == null || def.aStringArray913 == null || action == null) {
            return -1;
        }
        for (int i = 0; i < def.aStringArray913.length && i < OBJECT_OPCODES.length; i++) {
            if (def.aStringArray913[i] != null && def.aStringArray913[i].equalsIgnoreCase(action)) {
                return OBJECT_OPCODES[i];
            }
        }
        return -1;
    }

    static final class SceneObjectHit {
        final ObjectDefinition def;
        final Interface10 iface;
        final int localX;
        final int localY;
        final int plane;

        SceneObjectHit(ObjectDefinition def, Interface10 iface, int localX, int localY, int plane) {
            this.def = def;
            this.iface = iface;
            this.localX = localX;
            this.localY = localY;
            this.plane = plane;
        }
    }
}
