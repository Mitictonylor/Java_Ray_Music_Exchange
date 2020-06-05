package instruments;

import javax.sound.midi.Instrument;

public class Saxophone extends Instruments {

    private int numberOfValves;

    public Saxophone(String model, String brand, String material, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(model, brand, material, type, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
