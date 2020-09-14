package wearables;

public class Accessory extends Wearable {

    private boolean isJewellery;

    public Accessory(String name, boolean isCasual, boolean isPLain, boolean isChic, boolean isBright,
            boolean isJewellery) {
        super(name, isCasual, isPLain, isChic, isBright);
        this.isJewellery = isJewellery;
    }

    public boolean isJewellery() {
        return this.isJewellery;
    }

    public boolean isGoodWith(Wearable w) {
        // guard clause for when isGoodWith is ran on itself
        if (this.equals(w)) {
            return true;
        }
        // if Accessory is jewellery everything has to be non casual
        if (this.isJewellery() && w.isCasual()) {
            return false;
        }
        return true;
    }
}
