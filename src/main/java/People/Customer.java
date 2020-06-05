package People;

import behaviours.ISell;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<ISell> myMusicStuff;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.myMusicStuff = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public int countMyMusicStuff() {
        return this.myMusicStuff.size();
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void addToMusicStuff(ISell item ) {
        this.myMusicStuff.add(item);
    }

    public boolean enoughMoney(ISell item){
        return item.getSellingPrice() < this.getWallet();
    }
    public void buy(ISell item){
        if(enoughMoney(item)){
            this.setWallet(this.getWallet() - item.getSellingPrice());
            this.addToMusicStuff(item);
        }
    }
}
