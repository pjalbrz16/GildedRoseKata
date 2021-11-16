package com.gildedrose.test;

public class ItemConjured extends Item implements  IStrategy {
    public ItemConjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        this.sellIn -= Constants.DAY_INCREASE;

        if(this.sellIn <= 0 && this.quality <= 0){
            this.quality = Constants.LOWER_QUALITY_LIMIT;
            return;
        }

        if(this.sellIn > 0){
            this.quality -= Constants.DOUBLE_INCREASE;
        }else{
            this.quality -= Constants.DOUBLE_INCREASE * Constants.DOUBLE_INCREASE;
        }

    }
}
