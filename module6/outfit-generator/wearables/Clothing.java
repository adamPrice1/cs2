package wearables;

public abstract class Clothing extends Wearable {
    private boolean isWarm;
    private boolean isWaterproof;

    public Clothing(String name, boolean isCasual, boolean isPLain, boolean isChic, boolean isBright, boolean isWarm,
            boolean isWaterproof) {
        super(name, isCasual, isPLain, isChic, isBright);
        this.isWarm = isWarm;
        this.isWaterproof = isWaterproof;
    }

    public boolean isWarm() {
        return this.isWarm;
    }

    public boolean isWaterProof() {
        return this.isWaterproof;
    }
}
