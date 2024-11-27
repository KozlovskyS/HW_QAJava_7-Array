package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void TotalSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedTotalSales = 180;
        long actualTotalSales = service.totalSales(sales);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void AverageAmountSaleTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageAmountSale = 15;
        long actualAverageAmountSale = service.averageAmountSale(sales);

        Assertions.assertEquals(expectedAverageAmountSale, actualAverageAmountSale);
    }

    @Test
    public void NumberMaxMonthAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.numberMaxMonthAverage(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void NumberMinMonthAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.numberMinMonthAverage(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void QuantityMonthLessAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonth = 5;
        int actualQuantityMonth = service.countMonthLessAverage(sales);

        Assertions.assertEquals(expectedQuantityMonth, actualQuantityMonth);
    }

    @Test
    public void QuantityMonthOverAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonth = 5;
        int actualQuantityMonth = service.countMonthOverAverage(sales);

        Assertions.assertEquals(expectedQuantityMonth, actualQuantityMonth);
    }
}
