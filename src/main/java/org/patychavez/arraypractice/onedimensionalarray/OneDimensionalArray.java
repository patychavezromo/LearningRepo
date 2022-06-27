package org.patychavez.arraypractice.onedimensionalarray;

import java.util.Scanner;

public class OneDimensionalArray {

    Scanner input = new Scanner(System.in);

    public String [] requestData(){
        System.out.println("indicates the amount of data to enter:");
        int dataNumber= input.nextInt();
        input.nextLine();
        String [] stringArray = new String[dataNumber];
        for(int i=0; i<stringArray.length; i++){
            System.out.println("enter the string number "+(i+1)+":");
            String text= input.nextLine();
            stringArray[i]=text;
        }
        return stringArray;
    }
}
