package ru.netology.stats;

public class StatsService {
    public long calculateSumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long findAverage(long[] sales) {

        return calculateSumSales(sales) / sales.length;
    }


    public long findMaxSales(long[] sales) {
        long maxMonth = sales[0];
        long month = 0;
        for (long sale : sales) {
            if (sale >= sales[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long findMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long findMinAverage(long[] sales) {
        long minSale = 0;
        long average = findAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                minSale++;
            }
        }
        return minSale;

    }

    public long findMaxAverage(long[] sales) {
        long minSale = 0;
        long average = findAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                minSale++;
            }
        }
        return minSale;
    }
}