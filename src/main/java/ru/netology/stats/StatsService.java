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

    public int monthMinSales(long[] sales) {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        int month = 1;
        int monthMinSales = 0;
        for (long sale : sales) {
            if (sale == min) {
                monthMinSales = month;
            }
            month += 1;

        }

        return monthMinSales;
    }

    public int monthCountMoreThanAverage(long[] sales) {
        long average = average(sales);
        int count =0;
        for (long sale : sales) {
            if (sale > average) {
                count += 1;
            }
        }
        return count;
    }

    public int monthCountLessThanAverage(long[] sales) {
        long average = average(sales);
        int count =0;
        for (long sale : sales) {
            if (sale < average) {
                count += 1;
            }
        }
        return count;
    }



}
