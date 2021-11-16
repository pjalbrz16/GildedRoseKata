package com.gildedrose.test;


public class ItemSulfuras extends Item implements IStrategy{
    public ItemSulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
    }
}
