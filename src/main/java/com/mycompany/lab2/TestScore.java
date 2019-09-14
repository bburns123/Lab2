package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author 0800633
 */
public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first test score: ");
        int testScoreOne = scanner.nextInt();
        
        
        System.out.println("Enter the second test score: ");
        int testScoreTwo = scanner.nextInt();
        
        
        System.out.println("Enter the third test score: ");
        int testScoreThree = scanner.nextInt();
        
        double testScoreAvg = ((testScoreOne + testScoreTwo + testScoreThree) / 3);
        String Grade = "";
        
        if (testScoreAvg < 60) {
            Grade = "F"; 
        }
        else if (testScoreAvg < 70) {
            Grade = "D";
        }
        else if (testScoreAvg < 80) {
            Grade = "C";
        }
        else if (testScoreAvg < 90) {
            Grade = "B";
        }
        else if (testScoreAvg < 100) {
            Grade = "A";
        }
        
        System.out.println("The test score average is: " + testScoreAvg);
        System.out.println("The average letter grade is: " + Grade);
        
        
    }
           
}