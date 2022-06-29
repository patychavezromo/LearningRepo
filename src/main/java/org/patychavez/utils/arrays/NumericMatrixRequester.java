package org.patychavez.utils.arrays;

import java.util.Scanner;

public class NumericMatrixRequester {

    public int [][] dataRequestAtTheMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("number of rows:");
        int rows= input.nextInt();
        input.nextLine();
        System.out.println("number of columns:");
        int columns= input.nextInt();
        input.nextLine();
        int[][] numericMatrix = new int[rows][columns];
        for(int i=0; i<numericMatrix.length; i++){
            for(int j=0; j<numericMatrix[i].length; j++){
                System.out.println("enter a numerical data:");
                int data= input.nextInt();
                input.nextLine();
                numericMatrix[i][j]=data;
            }
        }
        return numericMatrix;
    }

}
