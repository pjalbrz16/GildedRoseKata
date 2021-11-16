package com.gildedrose.observer;

import com.gildedrose.test.Constants;

public class StrategyConjured implements IStrategy {
    @Override
    public void executeStrategy(Item item) {
        item.sellIn -= Constants.DAY_INCREASE;

        if(item.sellIn <= 0 && item.quality <= 0){
            item.quality = Constants.LOWER_QUALITY_LIMIT;
            return;
        }

        if(item.sellIn > 0){
            item.quality -= Constants.DOUBLE_INCREASE;
        }else{
            item.quality -= Constants.DOUBLE_INCREASE * Constants.DOUBLE_INCREASE;
        }
    }
}
