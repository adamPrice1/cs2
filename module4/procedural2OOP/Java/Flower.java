package procedural2OOP.Java;

public class Flower {
    String color;
    int height;
    float percentWater;

    public Flower(String newColor, int newHeight, float newPercentWater) {
        this.color = newColor;
        this.height = newHeight;
        this.percentWater = newPercentWater;
    }

    public void print() {
        System.out.println(this.color + " (" + Integer.toString(this.height) + " cm, "
                + Float.toString(this.percentWater) + "% water)");
    }

    public void grow() {
        this.height += 2;
        this.percentWater -= 0.05f;
    }

    public void water() {
        this.percentWater += 0.1f;
    }

}