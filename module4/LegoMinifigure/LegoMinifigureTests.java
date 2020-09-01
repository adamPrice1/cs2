package LegoMinifigure;

public class LegoMinifigureTests {
    public static void main(String[] args) {
        // Hat selection
        LegoHat topHat = new LegoHat("tophat", 11);
        LegoHat toqueHat = new LegoHat("toque", 10);
        LegoHat visorHat = new LegoHat("sun visor", 15);
        LegoHat trilbyHat = new LegoHat("trilby", 15);

        // Item selection
        LegoItem smallSword = new LegoItem("Small Sword", 500);
        LegoItem bigSword = new LegoItem("Big Sword", 5000);
        LegoItem macBook = new LegoItem("Macbook Pro", 200);
        LegoItem tlap = new LegoItem("Think Like a programmer", 550);

        // Lego minifigures

        LegoMinifigure adam = new LegoMinifigure("Adam", topHat, macBook, tlap);
        LegoMinifigure conan = new LegoMinifigure("Conan", toqueHat, bigSword, null);
        LegoMinifigure miniConan = new LegoMinifigure("Conan", visorHat, smallSword, null);

        System.out.println(adam.toString());
        System.out.println(conan.toString());

        System.out.println("MiniConan is a good minifigure: " + Boolean.toString(miniConan.isGood("summer", 300)));

        // swap hands
        adam.swapHands();
        System.out.println(adam.toString());

        // wear a new hat
        adam.wearHat(trilbyHat);
        System.out.println(adam.toString());

        // place in hands
        adam.placeInLeftHand(smallSword);
        adam.placeInRightHand(smallSword);
        System.out.println(adam.toString());
    }

}