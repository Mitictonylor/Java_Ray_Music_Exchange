package People;


import behaviours.ISell;

import java.util.ArrayList;

public class Wholesale{


    private ArrayList<ISell> stock;

    public Wholesale() {
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



    public void sell(ISell item, Shop shop){
        if (this.stock.contains(item)){
            shop.buy(item);
            this.removeFromStock(item);
        }
    }
}




