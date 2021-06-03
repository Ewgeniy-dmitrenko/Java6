package ru.netology.stats;

public class SaleStatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int maxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }

            month = month + 1;
        }
        return minMonth + 1;
    }

    public int averageSale(int[] sales) {
        int sum = calculateSum(sales);

        int average = sum / sales.length;
        return average;
    }

    public int belowAverageSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        int average = averageSale(sales);

        for (int sale : sales) {
            if (sale <= average) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int aboveAverageSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        int average = averageSale(sales);

        for (int sale : sales) {
            if (sale >= average) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
}



