package CToJava;

class ScotchTape {
    String colour;
    int weight;
    int length;

    public ScotchTape(final String objColour, final int objWeight, final int objLength) {
        colour = objColour;
        weight = objWeight;
        length = objLength;
    }

    static void printTapeArray(ScotchTape[] tapeArray, int length) {
        for (int i = 0; i < length; i++) {
            System.out.println(tapeArray[i].colour + " (" + Integer.toString(tapeArray[i].length) + " cm, "
                    + Integer.toString(tapeArray[i].weight) + " oz)");
        }
    }

    static void stickTape(ScotchTape tape, double percentToUse) {
        tape.weight -= (int) (tape.weight * percentToUse);
        tape.length -= (int) (tape.length * percentToUse);
    }

    public static void main(String[] args) {

        int NUM_TAPES = 3;
        ScotchTape[] tapes = new ScotchTape[NUM_TAPES];

        tapes[0] = new ScotchTape("clear", 3, 22);
        tapes[1] = new ScotchTape("green", 1, 15);
        tapes[2] = new ScotchTape("blue", 2, 19);

        printTapeArray(tapes, NUM_TAPES);

        stickTape(tapes[0], 0.5);
        stickTape(tapes[1], 0.3);
        stickTape(tapes[2], 0.9);
        printTapeArray(tapes, NUM_TAPES);

    }

}
