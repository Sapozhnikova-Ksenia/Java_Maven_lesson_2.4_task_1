package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void ShouldSumm (){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService ();
        long actual = service.summ (sales);
        long expacted = 123456;
        assertEquals (expacted, actual);

    }


}
