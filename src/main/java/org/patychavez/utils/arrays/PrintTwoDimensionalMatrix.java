package org.patychavez.utils.arrays;

public class PrintTwoDimensionalMatrix {

    public void printArray (int [][] array){
        for(int k=0; k< array.length; k++){
            for(int l=0; l< array[k].length; l++){
                System.out.print(array[k][l]);
                if(l== array.length-1){
                    System.out.println(".");
                }else {
                    System.out.print(", ");
                }
            }
        }
    }
}
