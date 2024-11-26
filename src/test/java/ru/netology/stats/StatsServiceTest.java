package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void TotalSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalSales = 180;
        int actualTotalSales = service.TotalSales(sales);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void AverageAmountSaleTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmountSale = 15;
        int actualAverageAmountSale = service.AverageAmountSale(sales);

        Assertions.assertEquals(expectedAverageAmountSale, actualAverageAmountSale);
    }

    @Test
    public void NumberMaxMonthAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.NumberMaxMonthAverage(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void NumberMinMonthAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.NumberMinMonthAverage(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void QuantityMonthLessAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonth = 5;
        int actualQuantityMonth = service.QuantityMonthLessAverage(sales);

        Assertions.assertEquals(expectedQuantityMonth, actualQuantityMonth);
    }

    @Test
    public void QuantityMonthOverAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonth = 5;
        int actualQuantityMonth = service.QuantityMonthOverAverage(sales);

        Assertions.assertEquals(expectedQuantityMonth, actualQuantityMonth);
    }
}
