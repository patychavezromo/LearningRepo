package org.patychavez.matrixprinter;

public class MatrixPrinter {

    public static void main() {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10}};
        for(int i=0; i< matrix.length; i++){
            System.out.println(" ");
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}
