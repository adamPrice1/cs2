package data;

public class CarDealership extends Store {
    private int numberOfCars;
    private int weeklySales;

    public CarDealership(int customerLimit, String storeName, boolean isOpen, int numberOfCars) {
        super(customerLimit, storeName, isOpen);
        this.numberOfCars = numberOfCars;
        this.weeklySales = 5;
    }

    public boolean isPerformingWell() {
        return (weeklySales > 10);
    }

    public int getNumberOfSales() {
        return this.weeklySales;
    }

    public void makeSale() {
        this.weeklySales += 1;
        this.numberOfCars -= 1;
    }

    public boolean isSoldOut() {
        return (numberOfCars <= 0);
    }
}
