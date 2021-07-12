package ru.netology.stats;

public class StatsService {
    public long summ(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average (long [] sales) {
        long summ = summ(sales);

        return summ / sales.length;
    }








}
