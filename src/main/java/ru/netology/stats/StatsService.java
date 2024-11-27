package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) { //расчет общей суммы продаж
        long totSales = 0;

        for (long sale : sales) {
            totSales = totSales + sale;
        }
        //System.out.println("Сумма всех продаж " + totSales);
        return totSales;
    }

    public long averageAmountSale(long[] sales) { //средняя сумма продаж
        //int average = totalSales(sales) / sales.length;
        //System.out.println("Средняя сумма " + average);
        return (totalSales(sales) / sales.length);
    }

    public int numberMaxMonthAverage(long[] sales) { //номер месяца максимума продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        //System.out.println("Максимум продаж в " + (maxMonth + 1) + " месяце");
        return maxMonth + 1;
    }

    public int numberMinMonthAverage(long[] sales) {  //номер месяца минимума продаж
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        //System.out.println("Минимум продаж в " + (minMonth + 1) + " месяце");
        return minMonth + 1;
    }

    public int countMonthLessAverage(long[] sales) { //число месяцев продаж ниже среднего
        int countMonth = 0;
        long averAmountSale = averageAmountSale(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averAmountSale) {
                countMonth = countMonth + 1;
            }
        }
        //System.out.println("Продажи ниже - " + quantityMonth);
        return countMonth;
    }

    public int countMonthOverAverage(long[] sales) {  //число месяцев продаж выше среднего
        int countMonth = 0;
        long averAmountSale = averageAmountSale(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averAmountSale) {
                countMonth = countMonth + 1;
            }
        }
        //System.out.println("Продажи выше - " + quantityMonth);
        return countMonth;
    }

}
