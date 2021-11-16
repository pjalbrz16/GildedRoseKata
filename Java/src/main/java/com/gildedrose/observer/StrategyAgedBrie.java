package com.gildedrose.observer;

import com.gildedrose.test.Constants;

public class StrategyAgedBrie implements IStrategy{
    @Override
    public void executeStrategy(Item item) {
        item.sellIn -= 1;

        if(item.quality >= 50){
            item.quality = Constants.UPPER_QUALITY_LIMIT;
            return;
        }

        if(item.quality > 0 && item.sellIn < 0 ) {
            item.quality += Constants.DOUBLE_INCREASE;

            if(item.quality >= Constants.UPPER_QUALITY_LIMIT){
                item.quality = Constants.UPPER_QUALITY_LIMIT;
            }
        }else{
            item.quality += Constants.STANDARD_INCREASE;
        }

    }
}
