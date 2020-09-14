package outfitGenerator;

import java.util.ArrayList;
import java.util.Random;
import wearables.Wearable;
import wearables.Accessory;
import wearables.Shirt;
import wearables.Pant;
import wearables.Outerwear;
import wearables.Shoe;

public class Wardrobe {
    private ArrayList<Shirt> shirts;
    private ArrayList<Pant> pants;
    private ArrayList<Outerwear> outerwear;
    private ArrayList<Shoe> shoes;
    private ArrayList<Accessory> accessories;

    public Wardrobe() {
        shirts = new ArrayList<Shirt>();
        pants = new ArrayList<Pant>();
        outerwear = new ArrayList<Outerwear>();
        shoes = new ArrayList<Shoe>();
        accessories = new ArrayList<Accessory>();
    }

    // add any item in the one function and send it to the correct ArrayList by
    // checking it's class type
    public boolean addItem(Wearable toAdd) {
        switch (toAdd.getClass().getName()) {
            case "wearables.Shirt":
                shirts.add((Shirt) toAdd);
                break;
            case "wearables.Pant":
                pants.add((Pant) toAdd);
                break;
            case "wearables.Outerwear":
                outerwear.add((Outerwear) toAdd);
                break;
            case "wearables.Shoe":
                shoes.add((Shoe) toAdd);
                break;
            case "wearables.Accessory":
                accessories.add((Accessory) toAdd);
                break;
        }
        return true;
    }

    // get random index of an ArrayList
    private int getRandomIndex(ArrayList itemArray) {
        Random rd = new Random();
        return rd.nextInt(itemArray.size());
    }

    // generate a random number 1/2 of possible accessories
    private int getNumberOfAccessories() {
        Random rd = new Random();
        return rd.nextInt(2) + 1;
    }

    // If an item does not fit with another part of the outfit, pass the compared
    // against Wearable and the Wearable to be replaced and return a valid
    // replacement.
    private Wearable replaceItem(Wearable toCompare, Wearable toReplace) {
        switch (toReplace.getClass().getName()) {
            case "wearables.Shirt":
                ArrayList<Shirt> possibleShirts = new ArrayList<>(this.shirts);
                possibleShirts.removeIf(n -> (!toCompare.isGoodWith(n)));
                if (possibleShirts.size() > 0) {
                    return (Wearable) possibleShirts.get(getRandomIndex(possibleShirts));
                }
                break;
            case "wearables.Pant":
                ArrayList<Pant> possiblePants = new ArrayList<>(this.pants);
                possiblePants.removeIf(n -> (!toCompare.isGoodWith(n)));
                if (possiblePants.size() > 0) {
                    return (Wearable) possiblePants.get(getRandomIndex(possiblePants));
                }
                break;
            case "wearables.Outerwear":
                ArrayList<Outerwear> possibleOuterwear = new ArrayList<>(this.outerwear);
                possibleOuterwear.removeIf(n -> (!toCompare.isGoodWith(n)));
                if (possibleOuterwear.size() > 0) {
                    return (Wearable) possibleOuterwear.get(getRandomIndex(possibleOuterwear));
                }
                break;
            case "wearables.Shoe":
                ArrayList<Shoe> possibleShoes = new ArrayList<>(this.shoes);
                possibleShoes.removeIf(n -> (!toCompare.isGoodWith(n)));
                if (possibleShoes.size() > 0) {
                    return (Wearable) possibleShoes.get(getRandomIndex(possibleShoes));
                }
                break;
            case "wearables.Accessory":
                ArrayList<Accessory> possibleAccessories = new ArrayList<>(this.accessories);
                possibleAccessories.removeIf(n -> (!toCompare.isGoodWith(n)));
                if (possibleAccessories.size() > 0) {
                    return (Wearable) possibleAccessories.get(getRandomIndex(possibleAccessories));
                }
                break;
        }
        return null;
    }

    // generate a new completely random ArrayList of item components
    private ArrayList<Wearable> generateRandomCombination() {
        Shirt outfitShirt = this.shirts.get(getRandomIndex(this.shirts));
        Pant outfitPant = this.pants.get(getRandomIndex(this.pants));
        Outerwear outfitOuterwear = this.outerwear.get(getRandomIndex(this.outerwear));
        Shoe outfitShoe = this.shoes.get(getRandomIndex(this.shoes));

        ArrayList<Wearable> outfitItems = new ArrayList<Wearable>();
        outfitItems.add(outfitShirt);
        outfitItems.add(outfitPant);
        outfitItems.add(outfitOuterwear);
        outfitItems.add(outfitShoe);
        return outfitItems;
    }

    // generate a new outfit
    public Outfit generateOutfit() {
        ArrayList<Wearable> outfitItems = this.generateRandomCombination();
        boolean outfitMatches = false;

        // this while loop makes sure that all the components of the outfit to be
        // generated match by running the isGoodWith() method of each item in every
        // combination
        while (!outfitMatches) {
            outfitMatches = true;
            for (int i = 0; i < outfitItems.size(); i++) {

                for (int j = 0; j < outfitItems.size(); j++) {
                    if (!(outfitItems.get(i).isGoodWith(outfitItems.get(j)))) {
                        // replace the item if isGoodWith == false
                        Wearable toRemove = outfitItems.get(j);
                        outfitItems.remove(j);
                        Wearable replacement = this.replaceItem(outfitItems.get(i), toRemove);
                        if (replacement != null) {
                            outfitItems.add(j, replacement);
                        } else {
                            outfitItems = this.generateRandomCombination();
                            outfitMatches = false;
                            break;
                        }
                        outfitMatches = false;
                    }
                }
            }
        }

        // add 1 or 2 accessories
        ArrayList<Accessory> outfitAccessories = new ArrayList<Accessory>();
        for (int i = 0; i < this.getNumberOfAccessories(); i++) {
            Accessory accessory = accessories.get(this.getRandomIndex(accessories));
            boolean accessoryMatches = true;
            for (int j = 0; j < outfitItems.size(); j++) {
                if (!(accessory.isGoodWith(outfitItems.get(j)))) {
                    accessoryMatches = false;
                }
            }
            if (accessoryMatches) {
                outfitAccessories.add(accessory);
            }
        }
        // return new Outfit instance
        return new Outfit((Shirt) outfitItems.get(0), (Pant) outfitItems.get(1), (Outerwear) outfitItems.get(2),
                (Shoe) outfitItems.get(3), outfitAccessories);
    }
}
