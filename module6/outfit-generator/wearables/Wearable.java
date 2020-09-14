package wearables;

import java.util.ArrayList;

public abstract class Wearable {
    private String name;
    private boolean isCasual;
    private boolean isPlain;
    private boolean isChic;
    private boolean isBright;

    public Wearable(String name, boolean isCasual, boolean isPLain, boolean isChic, boolean isBright) {
        this.name = name;
        this.isCasual = isCasual;
        this.isPlain = isPLain;
        this.isChic = isChic;
        this.isBright = isBright;
    }

    // declare abstract method to force subclasses to implement it
    public abstract boolean isGoodWith(Wearable w);

    // getters
    public boolean isCasual() {
        return this.isCasual;
    }

    public boolean isPlain() {
        return this.isPlain;
    }

    public boolean isChic() {
        return this.isChic;
    }

    public boolean isBright() {
        return this.isBright;
    }

    public String getName() {
        return this.name;
    }
}
