package instruments;

public class Guitar extends Instruments {

    private int numberOfStrings;

    public Guitar(String model, String brand, String material, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(model, brand, material, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
