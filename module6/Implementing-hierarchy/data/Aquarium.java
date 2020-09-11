package data;

public class Aquarium extends Store {
    private int numberOfFish;
    private boolean fishHaveBeenFed;

    // public Store(int customerLimit, String storeName, boolean isOpen) {
    public Aquarium(int customerLimit, String storeName, boolean isOpen, int numberOfFish) {
        super(customerLimit, storeName, isOpen);
        this.numberOfFish = numberOfFish;
        this.fishHaveBeenFed = false;
    }

    public boolean sellFish(int fishToSell) {
        if ((this.numberOfFish - fishToSell) < 0) {
            return false;
        }

        this.numberOfFish -= fishToSell;
        return true;
    }

    public boolean fishAreHungry() {
        return !this.fishHaveBeenFed;
    }

    public void feedFish() {
        this.fishHaveBeenFed = true;
    }

}
