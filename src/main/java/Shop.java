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
}
