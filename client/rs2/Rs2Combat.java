/**
 * Combat helpers built on {@link Rs2Player} / {@link Rs2Npc}.
 */
final class Rs2Combat {

    private Rs2Combat() {
    }

    static boolean inCombat() {
        return Rs2Player.inCombat();
    }

    /**
     * Attack nearest Attack-able NPC within {@code maxDist} tiles.
     *
     * @return true if an interact was issued
     */
    static boolean attackNearest(int maxDist) {
        Npc n = Rs2Npc.getNearestAttackable();
        if (n == null) {
            return false;
        }
        if (Rs2Player.distanceTo(n) > maxDist) {
            return false;
        }
        return Rs2Npc.attack(n);
    }
}
