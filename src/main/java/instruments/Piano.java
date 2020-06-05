package instruments;

public class Piano extends Instruments{

    private int octaveNumber;

    public Piano(String model, String brand, String material, InstrumentType type, double buyingPrice, double sellingPrice, int octaveNumber) {
        super(model, brand, material, type, buyingPrice, sellingPrice);
        this.octaveNumber = octaveNumber;
    }

    public int getOctaveNumber() {
        return octaveNumber;
    }
}
