package People;


import behaviours.ISell;

import java.util.ArrayList;

public class Shop{

    private double till;
    private ArrayList<ISell> stock;

    public Shop(double till) {
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public int countStock() {
        return this.stock.size();
    }


    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        if(this.stock.contains(item)){
            this.stock.remove(item);
        }
    }

    public double getTill() {
        return till;
    }

    public double totalMarkup() {
        double total = 0.0;
        for(ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }
    public void sell(ISell item, Customer customer){
        if (this.stock.contains(item)){
            customer.buy(item);
            this.removeFromStock(item);
            this.till += item.getSellingPrice();
        }
    }
}




