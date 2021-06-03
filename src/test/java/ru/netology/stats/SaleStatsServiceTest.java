package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaleStatsServiceTest {

    @Test
    void serviceSum() {
        SaleStatsService serviceSum = new SaleStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = serviceSum.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSale() {
        SaleStatsService serviceMax = new SaleStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = serviceMax.maxSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void minSale() {
        SaleStatsService serviceMin = new SaleStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = serviceMin.minSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void averageSale() {
        SaleStatsService serviceAverage = new SaleStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = serviceAverage.averageSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void belowAverageSale() {
        SaleStatsService serviceBelowAverageSale = new SaleStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 11;

        int actual = serviceBelowAverageSale.belowAverageSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void aboveAverageSale() {
        SaleStatsService serviceAboveAverageSale = new SaleStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;

        int actual = serviceAboveAverageSale.aboveAverageSale(sales);

        assertEquals(expected, actual);

    }

    }
