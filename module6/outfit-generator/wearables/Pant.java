package wearables;

public class Pant extends Clothing {

    private boolean needsBelt;

    public Pant(String name, boolean isCasual, boolean isPLain, boolean isChic, boolean isBright, boolean isWarm,
            boolean isWaterproof, boolean needsBelt) {
        super(name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof);
        this.needsBelt = needsBelt;
    }

    public boolean needsBelt() {
        return this.needsBelt;
    }

    public boolean isGoodWith(Wearable w) {
        // guard clause for when isGoodWith is ran on itself
        if (this.equals(w)) {
            return true;
        }

        // if pant needs belt then it can't go with any casual items
        if (this.needsBelt() && w.isCasual()) {
            return false;
        }

        // if the pants are waterproof, then outerwear needs to be waterproof also
        if (this.isWaterProof() && w instanceof Outerwear) {
            if (!((Outerwear) w).isWaterProof()) {
                return false;
            }
        }
        return true;
    }
}
