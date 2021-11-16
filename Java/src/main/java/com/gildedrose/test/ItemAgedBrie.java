package com.gildedrose.test;

public class ItemAgedBrie extends Item implements IStrategy {
    public ItemAgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        this.sellIn -= Constants.DAY_INCREASE;

        if(this.quality >= 50){
            this.quality = Constants.UPPER_QUALITY_LIMIT;
            return;
        }

        if(this.quality > 0 && this.sellIn < 0 ) {
            this.quality += Constants.DOUBLE_INCREASE;

            if(this.quality >= Constants.UPPER_QUALITY_LIMIT){
                this.quality = Constants.UPPER_QUALITY_LIMIT;
            }
        }else{
            this.quality += Constants.STANDARD_INCREASE;
        }


    }

}
