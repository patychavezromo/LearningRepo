package org.patychavez.matrixprinter;

public class MatrixPrinterMain {

    public static void main(){
        MatrixPrinter matrixPrinter = new MatrixPrinter();
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10}};
        matrixPrinter.printArray(matrix);

    }
}
