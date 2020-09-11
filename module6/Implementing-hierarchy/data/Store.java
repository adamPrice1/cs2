package data;

public class Store {
    private int customerLimit;
    private String storeName;
    private boolean isOpen;
    private int customersShopping;

    public Store(int customerLimit, String storeName, boolean isOpen) {
        this.customerLimit = customerLimit;
        this.storeName = storeName;
        this.isOpen = isOpen;
        this.customersShopping = 0;
    }

    public Store(int customerLimit, String storeName) {
        this(customerLimit, storeName, true);
    }

    public Store(String storeName) {
        this(100, storeName, true);
    }

    public String getStoreName() {
        return this.storeName;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public boolean isFull() {
        return !(this.customersShopping < this.customerLimit);
    }

    public void addCustomers(int customersToAdd) {
        this.customersShopping += customersToAdd;
    }

    public void openStore() {
        this.isOpen = true;
    }

    public void closeStore() {
        this.isOpen = false;
    }
}
