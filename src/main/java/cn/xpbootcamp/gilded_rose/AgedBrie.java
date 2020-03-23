package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class AgedBrie extends Goods {

    public AgedBrie(int quality, LocalDate sellIn) {
        super(quality, sellIn);
    }


    public int getQuality() {
        return super.getQuality();
    }
}
