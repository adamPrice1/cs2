package LegoMinifigure;

import java.util.Random;

public class LegoHat {

    String style;
    int size;

    public LegoHat(String newStyle, int newSize) {
        this.style = newStyle;
        this.size = newSize;
    }

    public String toString() {
        return "A size " + Integer.toString(this.size) + " " + this.style;
    }

    public int computeStyle(String season) {
        if (this.style == "toque" && season != "winter") {
            return 0;
        }
        if (this.style == "sun visor" && season != "summer") {
            return 0;
        }
        // Random rd = new Random();
        return 8;// rd.ints(0, 10).findFirst().getAsInt();
    }
}