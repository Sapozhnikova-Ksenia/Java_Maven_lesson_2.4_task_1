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


    public int monthMaxSales(long[] sales) {
        long max = sales [0];
        for (long sale : sales) {
            if (sale>max){
                max=sale;
            }
        }
        int month = 1;
        int monthMaxSales =0;
        for (long sale : sales) {
            if (sale==max) {
                monthMaxSales=month;
            }
            month +=1;
            
        }

        return monthMaxSales;

    }
}
