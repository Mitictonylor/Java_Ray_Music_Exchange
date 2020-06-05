package accessories;


public abstract class Accessories {
    private String model;
    private String brand;
    private double buyingPrice;
    private double sellingPrice;

    public Accessories(String model, String brand, double buyingPrice, double sellingPrice) {
        this.model = model;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
