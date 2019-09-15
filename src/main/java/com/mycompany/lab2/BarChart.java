/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Brendyn Burns
 */
public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unit = "*";
        String barOne = "";
        String barTwo = "";
        String barThree = "";
        String barFour = "";
        String barFive = "";
        
        System.out.println("Enter today's sales for store 1: ");
        int storeOne = scanner.nextInt();
        int divisibleOne = storeOne / 100;
        for (int i=1; i<= divisibleOne; i++) {
            barOne = barOne + unit;
        } 
        System.out.println("Enter today's sales for store 2: ");
        int storeTwo = scanner.nextInt();
        int divisibleTwo = storeTwo / 100;
        for (int i=1; i<= divisibleTwo; i++) {
            barTwo = barTwo + unit;
        } 
        System.out.println("Enter today's sales for store 3: ");
        int storeThree = scanner.nextInt();
        int divisibleThree = storeThree / 100;
        for (int i=1; i<= divisibleThree; i++) {
            barThree = barThree + unit;
        } 
        System.out.println("Enter today's sales for store 4: ");
        int storeFour = scanner.nextInt();
        int divisibleFour = storeFour / 100;
        for (int i=1; i<= divisibleFour; i++) {
            barFour = barFour + unit;
        } 
        System.out.println("Enter today's sales for store 5: ");
        int storeFive = scanner.nextInt();
        int divisibleFive = storeFive / 100;
        for (int i=1; i<= divisibleFive; i++) {
            barFive = barFive + unit;
        } 
        
        
        System.out.println("SALES BAR CHART");
        System.out.println("Store 1: " + barOne);
        System.out.println("Store 2: " + barTwo);
        System.out.println("Store 3: " + barThree);
        System.out.println("Store 4: " + barFour);
        System.out.println("Store 5: " + barFive);
    }
}
