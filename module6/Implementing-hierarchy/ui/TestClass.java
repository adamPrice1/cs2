package ui;

import data.Store;
import data.Aquarium;
import data.CarDealership;
import data.FranchiseDealership;

public class TestClass {
    public static void main(String[] args) {

        Store minotaurFitness = new Store(100, "Minotaur Fitness");
        if (minotaurFitness.isOpen()) {
            System.out.println(minotaurFitness.getStoreName() + " is Open!");
        }
        minotaurFitness.addCustomers(99);
        if (minotaurFitness.isFull()) {
            System.out.println(minotaurFitness.getStoreName() + " is full");
        } else if (!minotaurFitness.isFull()) {
            System.out.println(minotaurFitness.getStoreName() + " is not full");
        }
        minotaurFitness.addCustomers(1);
        if (minotaurFitness.isFull()) {
            System.out.println(minotaurFitness.getStoreName() + " is full");
        } else if (!minotaurFitness.isFull()) {
            System.out.println(minotaurFitness.getStoreName() + " is not full");
        }

        Aquarium minotaurFishness = new Aquarium(100, "Minotaur Fishness", true, 50);
        if (minotaurFishness.isFull()) {
            System.out.println(minotaurFishness.getStoreName() + " is full");
        } else if (!minotaurFishness.isFull()) {
            System.out.println(minotaurFishness.getStoreName() + " is not full");
        }

        if (minotaurFishness.fishAreHungry()) {
            System.out.println("the fish are hungry");
        }
        minotaurFishness.feedFish();
        if (!minotaurFishness.fishAreHungry()) {
            System.out.println("the fish are not hungry");
        }

        CarDealership carsRus = new CarDealership(100, "Cars R us", true, 500);

        if (!carsRus.isPerformingWell()) {
            System.out.println(carsRus.getStoreName() + " is not performing well");
        }
        carsRus.makeSale();
        carsRus.makeSale();
        carsRus.makeSale();
        carsRus.makeSale();
        carsRus.makeSale();
        carsRus.makeSale();
        if (carsRus.isPerformingWell()) {
            System.out.println(carsRus.getStoreName() + " is performing well");
        }

        FranchiseDealership jagsRus = new FranchiseDealership(100, "Jaguars R us", true, 500, "Jaguar");
        if (!jagsRus.hasPassedInspection()) {
            System.out.println(jagsRus.getStoreName() + " is due for an inspection");
        }
        jagsRus.runInspection();
        if (jagsRus.hasPassedInspection()) {
            System.out.println(jagsRus.getStoreName() + " Has passed its inspection");
        }
    }
}