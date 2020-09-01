package LegoMinifigure;

public class LegoItem {
    String name;
    float weight;

    public LegoItem(String newName, float newWeight) {
        this.name = newName;
        this.weight = newWeight;
    }

    public String toString() {
        return "A " + Float.toString(this.weight) + " gram " + this.name;
    }

    public boolean isHeavy(float threshold) {
        return (this.weight > threshold);
    }
}