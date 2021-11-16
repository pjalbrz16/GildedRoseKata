package com.gildedrose.observer;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    private static final String STANDARD = "";
    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras";
    private static final String BACKSTAGE_PASSES = "Backstage passes";
    private static final String CONJURED = "Conjured";


    static StrategyBackstagePasses strategyBackstagePasses = new StrategyBackstagePasses();
    static StrategyAgedBrie strategyAgedBrie = new StrategyAgedBrie();
    static StrategyConjured strategyConjured = new StrategyConjured();
    static StrategyStandard strategyStandard = new StrategyStandard();
    static StrategySulfuras strategySulfuras = new StrategySulfuras();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.contains(AGED_BRIE)) {
                Item.strategy = strategyAgedBrie;
            } else if (item.name.contains(SULFURAS)) {
                Item.strategy = strategySulfuras;
            } else if (item.name.contains(BACKSTAGE_PASSES)) {
                Item.strategy = strategyBackstagePasses;
            } else if (item.name.contains(CONJURED)) {
                Item.strategy = strategyConjured;
            } else {
                Item.strategy = strategyStandard;
            }

            item.updateQuality();
        }
    }
}
