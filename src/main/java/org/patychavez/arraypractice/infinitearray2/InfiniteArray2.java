package org.patychavez.arraypractice.infinitearray2;


import java.util.Scanner;

public class InfiniteArray2 {
    Scanner input=new Scanner(System.in);
    private int [] arrayList;
    private int counter;


    public InfiniteArray2(){
        this.arrayList = new int[3];
        this.counter=0;
    }



    public void add(int data){
        if(this.counter < this.arrayList.length) {
            this.arrayList[this.counter] = data;
            this.counter++;
        }else{
            increase();
            this.arrayList[this.counter]=data;
            this.counter++;
        }
    }

    public void printAll(){
        for(int i=0; i<this.counter; i++){
            System.out.print(this.arrayList[i]+" ");
        }
    }


    public void increase(){
        int[] newArrayList = new int[this.arrayList.length*2];
        for(int i=0; i<this.arrayList.length; i++){
            newArrayList[i]=this.arrayList[i];
        }
        this.arrayList=newArrayList;
    }

    public void remove(int index){
       for(int i=index; i<this.arrayList.length-1; i++){
           this.arrayList[i]=this.arrayList[i+1];
       }
        this.counter--;
    }


    public void modify(int index){
        System.out.println("indicate what data you want to replace");
        int dataNew= input.nextInt();
        this.arrayList[index]=dataNew;
    }




    public void menu(){
        int option=0;
        do {
            System.out.println("\n\nARRAY lIST\n" +
                    "1. add\n" +
                    "2. delete\n" +
                    "3. modify\n" +
                    "4. display list\n");
            option=  this.input.nextInt();
            this.input.nextLine();
            switch (option){
                case 1:
                    System.out.print(" enter data");
                    int newDateToAdd= input.nextInt();
                    input.nextLine();
                    add(newDateToAdd);
                    break;
                case 2:
                    System.out.println(" indicates the index to remove\n");
                    int indexToRemove= input.nextInt();
                    input.nextLine();
                    remove(indexToRemove);
                case 3:
                    System.out.println(" indicates the index to replace\n");
                    int indexToReplace= input.nextInt();
                    input.nextLine();
                    modify(indexToReplace);
                case 4:
                    System.out.println(" display the complete list\n");
                    printAll();
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
        }while(option<5);
    }

}
