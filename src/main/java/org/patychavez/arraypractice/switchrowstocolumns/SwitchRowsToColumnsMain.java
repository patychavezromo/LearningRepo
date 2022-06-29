package org.patychavez.arraypractice.switchrowstocolumns;

import org.patychavez.utils.arrays.NumericMatrixRequester;
import org.patychavez.utils.arrays.PrintTwoDimensionalMatrix;

public class SwitchRowsToColumnsMain {


    public static void main() {

        NumericMatrixRequester numericMatrixRequester = new NumericMatrixRequester();
        int[][] originalMatrix= numericMatrixRequester.dataRequestAtTheMatrix();
        SwitchRowsToColumns switchRowsToColumns = new SwitchRowsToColumns();
        int[][]invertedMatrix = switchRowsToColumns.changeRowsToColumns(originalMatrix);
        PrintTwoDimensionalMatrix printTwoDimensionalMatrix= new PrintTwoDimensionalMatrix();
        printTwoDimensionalMatrix.printArray(invertedMatrix);
    }
}
