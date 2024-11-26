package ru.netology.stats;

public class StatsService {

    public int TotalSales(int[] sales) {
        int totSales = 0;

        for (int sale : sales) {
            totSales = totSales + sale;
        }
        //System.out.println("Сумма всех продаж " + totSales);
        return totSales;
    }

    public int AverageAmountSale(int[] sales) {
        int average = TotalSales(sales) / sales.length;
        //System.out.println("Средняя сумма " + average);
        return average;
    }

    public int NumberMaxMonthAverage(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        //System.out.println("Максимум продаж в " + (maxMonth + 1) + " месяце");
        return maxMonth + 1;
    }
    public int NumberMinMonthAverage (int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        //System.out.println("Минимум продаж в " + (minMonth + 1) + " месяце");
        return minMonth + 1;
    }

    public int QuantityMonthLessAverage (int[] sales) {
        int quantityMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageAmountSale(sales)) {
                quantityMonth = quantityMonth +1;
            }
        }
        //System.out.println("Продажи ниже - " + quantityMonth);
        return quantityMonth;
    }

    public int QuantityMonthOverAverage (int[] sales) {
        int quantityMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageAmountSale(sales)) {
                quantityMonth = quantityMonth +1;
            }
        }
        //System.out.println("Продажи выше - " + quantityMonth);
        return quantityMonth;
    }

}
