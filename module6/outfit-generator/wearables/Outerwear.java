package wearables;

public class Outerwear extends Clothing {

    private boolean hasHood;

    public Outerwear(String name, boolean isCasual, boolean isPLain, boolean isChic, boolean isBright, boolean isWarm,
            boolean isWaterproof, boolean hasHood) {
        super(name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof);
        this.hasHood = hasHood;
    }

    public boolean hasHood() {
        return this.hasHood;
    }

    public boolean isGoodWith(Wearable w) {
        // guard clause for when isGoodWith is ran on itself
        if (this.equals(w)) {
            return true;
        }

        // if the outerwear has a hood pants must be waterproof
        if (this.hasHood() && w instanceof Pant) {
            if (!((Pant) w).isWaterProof()) {
                return false;
            }
        }
        return true;
    }
}
