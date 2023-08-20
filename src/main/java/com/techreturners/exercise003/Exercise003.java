package com.techreturners.exercise003;
import java.util.Arrays;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        //return findIndex(iceCreamFlavour, 0);
        return Arrays.asList(iceCreamFlavours).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours () {
        //return Arrays.stream(iceCreamFlavours);
        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

    String[] iceCreamFlavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

}
