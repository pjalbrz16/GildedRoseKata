package com.gildedrose.test;

public class ItemStandard extends Item implements IStrategy{
    public ItemStandard(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        this.sellIn -= Constants.DAY_INCREASE;

        if(this.sellIn < 0 && quality <= 0){
            this.quality = Constants.LOWER_QUALITY_LIMIT;
            return;
        }

        if(this.sellIn >= 0){
            this.quality -= Constants.STANDARD_INCREASE;
        }else{
            this.quality -= Constants.STANDARD_INCREASE * Constants.DOUBLE_INCREASE;
        }
    }
}
