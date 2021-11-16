package com.gildedrose.test;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for(Item item : items){
            if(item instanceof ItemAgedBrie){
                ItemAgedBrie itemAgedBrie = (ItemAgedBrie) item;
                itemAgedBrie.updateQuality();
            }else if (item instanceof  ItemBackstagePasses){
                ItemBackstagePasses itemBackstagePasses = (ItemBackstagePasses) item;
                itemBackstagePasses.updateQuality();
            }else if (item instanceof ItemConjured){
                ItemConjured itemConjured = (ItemConjured) item;
                itemConjured.updateQuality();
            }else if(item instanceof  ItemStandard){
                ItemStandard itemStandard = (ItemStandard) item;
                itemStandard.updateQuality();
            }else if(item instanceof ItemSulfuras){
                ItemSulfuras itemSulfuras = (ItemSulfuras) item;
                itemSulfuras.updateQuality();
            }
        }



    }
}
