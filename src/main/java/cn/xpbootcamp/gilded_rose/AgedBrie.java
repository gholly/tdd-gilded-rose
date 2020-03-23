package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class AgedBrie extends Goods {

    private int addRate;

    public AgedBrie(int quality, LocalDate sellIn, int addRate) {
        super(quality, sellIn);
        this.addRate = addRate;
    }


    public int getQuality(LocalDate sellInDay) {
        int value = super.getQuality() + addRate * super.getSellIn().until(sellInDay).getDays();
        return value > 50 ? 50 : value;
    }
}
