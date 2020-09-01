package LegoMinifigure;

public class LegoMinifigure {
    String name;
    LegoHat hat;
    LegoItem leftHand;
    LegoItem rightHand;

    // could overload constructor here but that would give us 6 methods vs some if
    // statements checking if a variable is not null
    public LegoMinifigure(String newName, LegoHat newHat, LegoItem newLeft, LegoItem newRight) {
        this.name = newName;
        this.hat = newHat;
        this.leftHand = newLeft;
        this.rightHand = newRight;
    }

    public String toString() {
        String hatText;
        if (this.hat != null) {
            hatText = this.hat.toString();
        } else {
            hatText = "no hat";
        }
        String leftHandText;
        if (this.leftHand != null) {
            leftHandText = this.leftHand.toString();
        } else {
            leftHandText = "nothing";
        }
        String rightHandText;
        if (this.rightHand != null) {
            rightHandText = this.rightHand.toString();
        } else {
            rightHandText = "nothing";
        }
        return " A minifigure named " + this.name + " wearing " + this.hat.toString() + " with a " + leftHandText
                + " in their left hand and " + rightHandText + " in their right.";
    }

    public void swapHands() {
        LegoItem temp = this.leftHand;
        this.leftHand = this.rightHand;
        this.rightHand = temp;
    }

    public void wearHat(LegoHat hat) {
        this.hat = hat;
    }

    public void placeInLeftHand(LegoItem item) {
        this.leftHand = item;
    }

    public void placeInRightHand(LegoItem item) {
        this.rightHand = item;
    }

    public boolean isGood(String season, float threshold) {
        if (this.hat == null) {
            return false;
        }

        boolean leftHandHeavy;
        if (this.leftHand == null) {
            leftHandHeavy = false;
        } else {
            leftHandHeavy = this.leftHand.isHeavy(1000);
        }

        boolean rightHandHeavy;
        if (this.rightHand == null) {
            rightHandHeavy = false;
        } else {
            rightHandHeavy = this.rightHand.isHeavy(1000);
        }

        if (this.hat.computeStyle(season) >= 6 && !leftHandHeavy && !rightHandHeavy) {
            return true;
        }
        return false;
    }
}