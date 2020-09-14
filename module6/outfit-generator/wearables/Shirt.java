package wearables;

public class Shirt extends Clothing {

    private boolean canBeTuckedIn;

    public Shirt(String name, boolean isCasual, boolean isPLain, boolean isChic, boolean isBright, boolean isWarm,
            boolean isWaterproof, boolean canBeTuckedIn) {
        super(name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof);
        this.canBeTuckedIn = canBeTuckedIn;
    }

    public boolean canBeTuckedIn() {
        return this.canBeTuckedIn;
    }

    public boolean isGoodWith(Wearable w) {
        // guard clause for when isGoodWith is ran on itself
        if (this.equals(w)) {
            return true;
        }
        // if the shirt is casual and the item isn't auto fail
        // if (this.isCasual() != w.isCasual()) {
        // return false;
        // }
        // if the shirt is bright the other item can't be plain
        if (this.isBright() && !w.isBright()) {
            return false;
        }
        return true;
    }
}
