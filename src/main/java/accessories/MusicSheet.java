package accessories;

public class MusicSheet extends Accessories{

    private int numberOfSheets;

    public MusicSheet(String model, String brand, double buyingPrice, double sellingPrice, int numberOfSheets) {
        super(model, brand, buyingPrice, sellingPrice);
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }
}
