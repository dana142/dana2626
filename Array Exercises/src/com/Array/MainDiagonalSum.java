package com.Array;
import java.util.Scanner;

public class MainDiagonalSum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int n =sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for( int i = 0; i< n; i++) {
            sum += matrix[i][i];
        }
        System.out.println ("Sum of the main diagonal: " + sum);
    }
}
