package People;


import behaviours.ISell;

import java.util.ArrayList;

public class Wholesale{


    private ArrayList<ISell> stock;

    private double till;

    public Wholesale(double till) {
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public int countStock() {
        return this.stock.size();
    }

    public double getTill() {
        return till;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        if(this.stock.contains(item)){
            this.stock.remove(item);
        }
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void sell(ISell item, Shop shop){
        if (this.stock.contains(item)){
            shop.buy(item);
            this.removeFromStock(item);
            this.setTill(this.getTill() + item.getBuyingPrice());
        }
    }
}




