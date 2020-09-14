package outfitGenerator;

import java.util.ArrayList;
import wearables.Wearable;
import wearables.Accessory;
import wearables.Shirt;
import wearables.Pant;
import wearables.Outerwear;
import wearables.Shoe;

public class Outfit {
    private Shirt shirt;
    private Pant pant;
    private Outerwear outerwear;
    private Shoe shoe;
    private ArrayList<Accessory> accessories;

    public Outfit(Shirt shirt, Pant pant, Outerwear outerwear, Shoe shoe, ArrayList<Accessory> accessories) { //
        this.shirt = shirt;
        this.pant = pant;
        this.outerwear = outerwear;
        this.shoe = shoe;
        this.accessories = accessories;
    }

    public Shirt getShirt() {
        return this.shirt;
    }

    public Pant getPant() {
        return this.pant;
    }

    public Outerwear getOuterwear() {
        return this.outerwear;
    }

    public Shoe getShoe() {
        return this.shoe;
    }

    public ArrayList<Accessory> getAccessories() {
        return this.accessories;
    }

    // print the arrayList of Accessories
    private String accessoriesToString() {
        String output = "";
        for (int i = 0; i < accessories.size(); i++) {
            output += accessories.get(i).getName() + " ";
        }
        return output;
    }

    // override default toString() method
    public String toString() {
        return String.format("shirt: %s , Pant: %s, Outerwear: %s, Shoe: %s, Accessories: %s", shirt.getName(),
                pant.getName(), outerwear.getName(), shoe.getName(), this.accessoriesToString());
    }
}
