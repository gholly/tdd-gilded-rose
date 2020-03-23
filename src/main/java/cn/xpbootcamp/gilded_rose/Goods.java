package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class Goods {
    private int quality;
    private LocalDate sellIn;

    public int getQuality() {
        return this.quality;
    }

    public LocalDate getSellIn() {
        return this.sellIn;
    }

    public Goods(int quality, LocalDate sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
    }
}
