package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class AgedBrie extends Goods {
    private LocalDate sellIn;

    public AgedBrie(int quality) {
        super(quality);
    }


    public int getQuality() {
        return 0;
    }
}
