package instruments;

import behaviours.IPlay;

public class Guitar extends Instruments implements IPlay {

    private int numberOfStrings;

    public Guitar(String model, String brand, String material, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(model, brand, material, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String sound() {
        return "wah wah wah";
    }
}
