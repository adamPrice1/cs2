package data;

public class FranchiseDealership extends CarDealership {
    private boolean hasHadInspection;
    private String brand;

    public FranchiseDealership(int customerLimit, String storeName, boolean isOpen, int numberOfCars, String brand) {
        super(customerLimit, storeName, isOpen, numberOfCars);
        this.hasHadInspection = false;
        this.brand = brand;
    }

    public boolean hasPassedInspection() {
        return this.hasHadInspection;
    }

    public void runInspection() {
        this.hasHadInspection = true;
    }

    public boolean isPerformingWell() {
        return (this.getNumberOfSales() > 100);
    }

    public String getBrand() {
        return this.brand;
    }

}
