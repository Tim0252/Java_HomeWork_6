package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void TestAllSales() {
        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calculateAllSale(sales);
        long expected = 180;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void TestAverageSale() {
        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calculateAverageSale(sales);
        long expected = 15;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void TestMaxMatch() {
        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.monthMaxSales(sales);
        long expected = 8;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void TestMinMatch() {
        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.monthMinSales(sales);
        long expected = 9;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void TestBelowAverage() {
        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calculateBelowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void TestAboveAverage() {
        long[] sales= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actual = service.calculateAboveAverage(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);
    }


}