package procedural2OOP.Java;

public class FlowerTest {

    public static void main(String[] args) {
        Flower flower = new Flower("Purple", 10, 0.5f);
        flower.print();
        flower.water();
        flower.print();
        flower.grow();
        flower.print();
    }

}