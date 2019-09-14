package com.mycompany.lab2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 0800633
 */
public class BankCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of checks used per month: ");
        
        int amountOfChecks = scanner.nextInt();
        double upCharge = 10.00;
        
        double subTotal = 0;
        if (amountOfChecks < 20) {
            subTotal = amountOfChecks * .1;
        }
        else if (amountOfChecks < 40) {
            subTotal = amountOfChecks * .08;
        }
        else if (amountOfChecks < 60) {
            subTotal = amountOfChecks * .06;
        }
        else if (amountOfChecks >= 60) {
            subTotal = amountOfChecks * .04;
        }
        
        double total = subTotal + upCharge;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        
        System.out.println("The monthly charge for " + amountOfChecks + " checks is: " + currencyInstance.format(total));
        
    }
}