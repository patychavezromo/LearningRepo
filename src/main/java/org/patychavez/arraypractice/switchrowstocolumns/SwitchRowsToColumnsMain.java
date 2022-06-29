package org.patychavez.arraypractice.switchrowstocolumns;

import org.patychavez.utils.NumericMatrixRequester;

public class SwitchRowsToColumnsMain {


    public static void main() {

        NumericMatrixRequester numericMatrixRequester = new NumericMatrixRequester();
        int[][] originalMatrix= numericMatrixRequester.dataRequestAtTheMatrix();
        SwitchRowsToColumns switchRowsToColumns = new SwitchRowsToColumns();
        int[][]invertedMatrix = switchRowsToColumns.changeRowsToColumns(originalMatrix);

        /*print matrix */

        for(int k=0; k< invertedMatrix.length; k++){
            for(int l=0; l< invertedMatrix[k].length; l++){
                System.out.print(invertedMatrix[k][l]);
                if(l== invertedMatrix.length-1){
                    System.out.println(".");
                }else {
                    System.out.print(", ");
                }
            }
        }
    }
}
