package data;

public class JaguarDealership extends CarDealership {
    private boolean hasHadJaguarInspection;

    public JaguarDealership(int customerLimit, String storeName, boolean isOpen, int numberOfCars) {
        super(customerLimit, storeName, isOpen, numberOfCars);
        this.hasHadJaguarInspection = false;
    }

    public boolean hasPassedInspection() {
        return this.hasHadJaguarInspection;
    }

    public void runInspection() {
        this.hasHadJaguarInspection = true;
    }
}
