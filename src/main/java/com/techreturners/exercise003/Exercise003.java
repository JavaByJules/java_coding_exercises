package com.techreturners.exercise003;
import java.util.Arrays;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        return Arrays.asList(iceCreamFlavours).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours () {
        return iceCreamFlavours;
    }

    String[] iceCreamFlavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

}
