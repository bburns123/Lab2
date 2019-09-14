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
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive nonzero integer value you wish to have the sum of: ");
        
        int lastCount = scanner.nextInt();
        int count = 1;
        int total = 0;
        while (count != (lastCount) + 1) {
            total += count;
            count++;
        }
            
        System.out.println("The total sum of " + lastCount + " is: " + total);
    }
}
