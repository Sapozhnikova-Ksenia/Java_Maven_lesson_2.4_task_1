package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void ShouldSumm() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.summ(sales);
        long expected = 180;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.average(sales);
        long expected = 15;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldFitBackMonthMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthMaxSales(sales);
        long expected = 8;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldFitBackMonthMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthMinSales(sales);
        long expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldFitBackCountMonthMoreThanAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthCountMoreThanAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldFitBackCountMonthLessAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthCountLessThanAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);

    }



}
