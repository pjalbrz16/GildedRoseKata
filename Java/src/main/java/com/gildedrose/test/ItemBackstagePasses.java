package com.gildedrose.test;

public class ItemBackstagePasses extends Item implements IStrategy {
    public ItemBackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {

        if (this.sellIn <= Constants.LIMIT.EXPIRED.day) {
            this.quality = Constants.LOWER_QUALITY_LIMIT;
        } else if (this.sellIn <= Constants.LIMIT.DAYS5.day) {
            this.quality += Constants.TRIPLE_INCREASE;
        } else if (this.sellIn <= Constants.LIMIT.DAYS10.day) {
            this.quality += Constants.DOUBLE_INCREASE;
        } else if (this.sellIn > Constants.LIMIT.DAYS10.day) {
            this.quality += Constants.STANDARD_INCREASE;
        }

        if(this.quality >= Constants.UPPER_QUALITY_LIMIT){
            this.quality = Constants.UPPER_QUALITY_LIMIT;
        }

        this.sellIn -= Constants.DAY_INCREASE;

    }
}
