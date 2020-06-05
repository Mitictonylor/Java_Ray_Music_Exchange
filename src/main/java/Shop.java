import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
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

    public double totalMarkup() {
        double total = 0.0;
        for(ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
