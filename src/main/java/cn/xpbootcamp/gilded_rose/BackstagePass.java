package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class BackstagePass extends Goods {
    private LocalDate performanceDay;

    public BackstagePass(int quality, LocalDate sellIn, LocalDate performanceDay) {
        super(quality,sellIn);
        this.performanceDay = performanceDay;
    }

    /**
     * 商品的价值永远不会小于0，也永远不会超过50
     * 一旦过了保质期，Quality就以双倍的速度下滑
     * 陈年干酪（Aged Brie）是一种特殊的商品，放得越久，价值反而越高
     * 萨弗拉斯（Sulfuras）是一种传奇商品，没有保质期的概念，质量也不会下滑
     * 后台门票（Backstage pass）和陈年干酪（Aged Brie）有相似之处：
     * - 越接近演出日，随着SellIn值的增加，商品价值Quality值反而上升
     * - 在演出前10天，价值每天上升2点
     * - 演出前5天，价值每天上升3点
     * - 一旦过了演出日，价值就马上变成0
     *
     * @return
     */

    public int getQuality() {
        int value = super.getQuality();
        if (super.getSellIn().isAfter(performanceDay)) {
            return 0;
        }
        int days = super.getSellIn().until(performanceDay).getDays();
        if (days > 5 && days <= 10) {
            value = super.getQuality() + 2 * (10 - days);
        }
        if (days <= 5) {
            value = super.getQuality() + 2 * 5 + 3 * (5 - days);
        }
        return value > 50 ? 50 : value;
    }
}
