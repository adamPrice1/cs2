package ui;

import java.util.ArrayList;

import outfitGenerator.Wardrobe;
import outfitGenerator.Outfit;
import wearables.Accessory;
import wearables.Shirt;
import wearables.Pant;
import wearables.Outerwear;
import wearables.Shoe;

public class OutfitGenerator {
    public static void main(String[] args) {

        ArrayList<Outfit> outfits = new ArrayList<Outfit>();
        Wardrobe wardrobe = new Wardrobe();

        // Shirts
        // (name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof,
        // canBeTuckedIn)
        wardrobe.addItem(new Shirt("white T-shirt", true, true, true, false, false, false, true));
        wardrobe.addItem(new Shirt("Dress shirt", false, true, true, false, false, false, true));
        wardrobe.addItem(new Shirt("Vest", true, true, false, false, false, false, true));
        wardrobe.addItem(new Shirt("Denim shirt", true, true, true, false, true, false, false));
        wardrobe.addItem(new Shirt("Tie-dyed T-shirt", true, false, true, true, false, false, false));
        wardrobe.addItem(new Shirt("Ruffled shirt", false, false, true, true, false, false, true));
        wardrobe.addItem(new Shirt("Flame shirt", false, false, true, true, true, false, true));

        // Pants
        // (name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof, needsBelt)
        wardrobe.addItem(new Pant("Denim Jeans", true, true, true, false, true, false, true));
        wardrobe.addItem(new Pant("Sequin Jeans", false, false, true, true, true, false, true));
        wardrobe.addItem(new Pant("Parachute pants", false, false, true, true, false, false, false));
        wardrobe.addItem(new Pant("Tracksuit bottoms", true, true, false, false, true, false, false));
        wardrobe.addItem(new Pant("Jorts", true, false, true, false, false, false, true));
        wardrobe.addItem(new Pant("Dungarees", true, true, false, false, true, true, false));

        // Outerwear
        // (name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof, hasHood)
        wardrobe.addItem(new Outerwear("Denim Jacket", true, true, true, false, true, false, false));
        wardrobe.addItem(new Outerwear("Hoodie", true, true, false, false, true, false, true));
        wardrobe.addItem(new Outerwear("Tie-Dye Hoodie", true, false, true, true, true, false, true));
        wardrobe.addItem(new Outerwear("Suit Jacket", false, true, true, false, true, false, false));
        wardrobe.addItem(new Outerwear("Trenchcoat", false, true, true, false, true, true, false));

        // Shoes
        // (name, isCasual, isPLain, isChic, isBright, isWarm, isWaterproof,
        // isComfortable)
        wardrobe.addItem(new Shoe("Oxfords", false, true, true, false, false, false, false));
        wardrobe.addItem(new Shoe("Brogues", false, false, true, false, false, false, false));
        wardrobe.addItem(new Shoe("Hiking boots", true, true, false, false, true, true, true));
        wardrobe.addItem(new Shoe("Flip-Flops", true, true, false, false, false, false, true));
        wardrobe.addItem(new Shoe("Sliders", true, true, false, false, false, false, true));

        // Accessories
        // (name, isCasual, isPLain, isChic, isBright, isJewellery)
        wardrobe.addItem(new Accessory("Cufflinks", false, true, true, false, true));
        wardrobe.addItem(new Accessory("Black Tie", false, true, true, false, false));
        wardrobe.addItem(new Accessory("Bowtie", false, true, true, false, false));
        wardrobe.addItem(new Accessory("Bobblehat", true, true, false, false, false));
        wardrobe.addItem(new Accessory("Stetson hat", true, true, false, false, false));
        wardrobe.addItem(new Accessory("Diamond ring", false, false, true, true, true));
        wardrobe.addItem(new Accessory("Gold nose ring", false, true, true, true, true));
        wardrobe.addItem(new Accessory("Emerald earrings", false, false, true, true, true));
        wardrobe.addItem(new Accessory("Rolex watch", false, true, true, true, true));
        wardrobe.addItem(new Accessory("Casio calculator watch", true, true, false, false, true));
        wardrobe.addItem(new Accessory("Gold Bracelet", false, false, true, true, true));

        Outfit newOutfit = wardrobe.generateOutfit();
        System.out.println(newOutfit.toString());

        newOutfit = wardrobe.generateOutfit();
        System.out.println(newOutfit.toString());

        newOutfit = wardrobe.generateOutfit();
        System.out.println(newOutfit.toString());

        newOutfit = wardrobe.generateOutfit();
        System.out.println(newOutfit.toString());

        newOutfit = wardrobe.generateOutfit();
        System.out.println(newOutfit.toString());

        newOutfit = wardrobe.generateOutfit();
        System.out.println(newOutfit.toString());
    }

}
