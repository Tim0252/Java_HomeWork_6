package ru.netology.stats;


public class StatsService {
    public long calculateAllSale(long[] sales) {
        long allsale = 0;
        for (long sale : sales) {
            allsale += sale;
        }
        return allsale;
    }

    public long calculateAverageSale (long[] sales) {
        long averagesale = 0;
        for (long sale : sales) {
            averagesale += sale;
        }
        long averagesales = averagesale / 12;
        return averagesales;
    }

    public int monthMaxSales(long[] sales) {
        int maxMonch = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonch]) {
                maxMonch = i;
            }
        }
        return maxMonch +1;
    }
    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int calculateBelowAverage(long[] sales) {
        int counter = 0;
        long averageSales = calculateAverageSale(sales);
        for (long sale : sales){
            if (sale < averageSales) {
                counter ++;
            }
        }
        return counter;
    }
    public int calculateAboveAverage(long[] sales) {
        int counter = 0;
        long averageSales = calculateAverageSale(sales);
        for (long sale : sales){
            if (sale > averageSales) {
                counter ++;
            }
        }
        return counter;
    }
}
