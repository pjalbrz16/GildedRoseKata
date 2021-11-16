package com.gildedrose.observer;

import com.gildedrose.test.Constants;

public class StrategyBackstagePasses implements IStrategy {
    @Override
    public void executeStrategy(Item item) {

        if (item.sellIn <= Constants.LIMIT.EXPIRED.day) {
            item.quality = Constants.LOWER_QUALITY_LIMIT;
        } else if (item.sellIn <= Constants.LIMIT.DAYS5.day) {
            item.quality += Constants.TRIPLE_INCREASE;
        } else if (item.sellIn <= Constants.LIMIT.DAYS10.day) {
            item.quality += Constants.DOUBLE_INCREASE;
        } else if (item.sellIn > Constants.LIMIT.DAYS10.day) {
            item.quality += Constants.STANDARD_INCREASE;
        }

        if(item.quality >= Constants.UPPER_QUALITY_LIMIT){
            item.quality = Constants.UPPER_QUALITY_LIMIT;
        }

        item.sellIn -= Constants.DAY_INCREASE;
    }

}
