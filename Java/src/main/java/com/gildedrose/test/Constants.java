package com.gildedrose.test;

public interface Constants {
    public final Integer DAY_INCREASE = 1;
    public final Integer STANDARD_INCREASE = 1;
    public final Integer LOWER_QUALITY_LIMIT = 0;
    public final Integer UPPER_QUALITY_LIMIT = 50;
    public final Integer DOUBLE_INCREASE = 2;
    public final Integer TRIPLE_INCREASE = 3;

    enum LIMIT{
        EXPIRED(0 , 0),DAYS5(5, -3),DAYS10(10, -2);

        public int day;
        public int qualityChange;

        LIMIT(int day, int qualityChange) {
            this.day = day;
            this.qualityChange = qualityChange;
        }
    }


}
