package org.patychavez.arraypractice.switchrowstocolumns;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwitchRowsToColumns {

    public int[][] changeRowsToColumns(int [][] mainMatrix){
        System.out.print("THIS IS THE ORIGINAL MATRIX");
        for(int i=0; i< mainMatrix.length; i++){
            System.out.println(" ");
            for(int j=0; j<mainMatrix[i].length; j++){
                System.out.print(mainMatrix[i][j]);
                if(j==mainMatrix.length-1){
                    System.out.print(".");
                }else{
                    System.out.print(", ");
                }
            }
        }
        System.out.print("\n\nTHIS IS THE MATRIX WITH INVERTED ROWS AND COLUMNS\n");
        int rows= mainMatrix.length;
        int columns= mainMatrix[0].length;
        if(rows != columns){
            throw new RuntimeException("the rows must have the same size as the columns");
        }
        int[][] invertedMatrix = new int [rows][columns];
            for (int i=0; i < mainMatrix.length; i++) {
                for (int j = 0; j < mainMatrix[i].length; j++) {
                    invertedMatrix[j][i]=mainMatrix[i][j];
                }
            }
        return invertedMatrix;
    }

}
