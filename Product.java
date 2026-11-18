/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreportapp;

/**
 *
 * @author lenovo
 */
public class Product implements IProduct {

    private String[] productNames;          // Single-dimensional array
    private int[][] salesData;              // Two-dimensional array [product][month]
    private final int NUM_PRODUCTS = 3;
    private final int NUM_MONTHS = 3;

    // Constructor
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    // Calculate total products sold across all products and months
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < NUM_PRODUCTS; i++) {
            for (int j = 0; j < NUM_MONTHS; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    // Calculate average products sold (total / 9)
    @Override
    public double GetAverageProductSold() {
        return (double) GetTotalProductsSold() / (NUM_PRODUCTS * NUM_MONTHS);
    }

    // Find the most popular product based on highest total sales
    @Override
    public String GetMostPopularProduct() {
        int maxTotal = -1;
        int maxIndex = 0;

        for (int i = 0; i < NUM_PRODUCTS; i++) {
            int productTotal = 0;
            for (int j = 0; j < NUM_MONTHS; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                maxIndex = i;
            }
        }
        return productNames[maxIndex] + " (" + maxTotal + ")";
    }

    // Helper method (useful for testing)
    public int getProductTotal(int productIndex) {
        int total = 0;
        for (int j = 0; j < NUM_MONTHS; j++) {
            total += salesData[productIndex][j];
        }
        return total;
    }
}