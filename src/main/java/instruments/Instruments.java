package instruments;

import behaviours.ISell;

public abstract class Instruments implements ISell {
    private String model;
    private String brand;
    private String material;
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;


    public Instruments(String model, String brand, String material, InstrumentType type, double buyingPrice, double sellingPrice) {
        this.model = model;
        this.brand = brand;
        this.material = material;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
