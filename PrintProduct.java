/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreportapp;

/**
 *
 * @author lenovo
 */
public class PrintProduct {

    public void printTotalProductSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }

    public void printAverageProductSales(double average) {
        // Sample output shows integer average
        System.out.println("AVERAGE PRODUCT SALES: " + (int) average);
    }

    public void printMostPopularProduct(String mostPopular) {
        System.out.println("MOST POPULAR PRODUCT: " + mostPopular);
    }

    // Convenience method to print the full report header + values
    public void printFullReport(Product product) {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");
        printTotalProductSales(product.GetTotalProductsSold());
        printAverageProductSales(product.GetAverageProductSold());
        printMostPopularProduct(product.GetMostPopularProduct());
    }
}
