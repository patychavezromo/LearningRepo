# Switch rows to columns
***

This program changes the order of data stored in rows by columns.

**Example:**

````java

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

```