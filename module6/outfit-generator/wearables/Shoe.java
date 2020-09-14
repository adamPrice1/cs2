package wearables;

public class Shoe extends Clothing {

    private boolean isComfortable;

    public Shoe(String name, boolean isCasual, boolean isPLain, boolean isChic, boolean isBright, boolean isWarm,
            boolean isWaterproof, boolean isComfortable) {
        super(name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof);
        this.isComfortable = isComfortable;
    }

    public boolean isComfortable() {
        return this.isComfortable;
    }

    public boolean isGoodWith(Wearable w) {
        // guard clause for when isGoodWith is ran on itself
        if (this.equals(w)) {
            return true;
        }

        // if shoe is bright then pants need to be plain
        if (this.isBright() && w instanceof Pant && !w.isPlain()) {
            return false;
        }
        return true;
    }
}
