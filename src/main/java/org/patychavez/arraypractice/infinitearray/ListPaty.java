package org.patychavez.arraypractice.infinitearray;

public class ListPaty {


    private int [] dataArray;
    private int size=0;


    public ListPaty(){
        this.dataArray = new int[3];
    }


    public void add(int number){
        if(size < dataArray.length){
            this.dataArray[this.size]=number;
            this.size++;
        }else{
            increaseArray();
            this.dataArray[this.size]=number;
            this.size++;
        }
    }

    public void increaseArray(){
        int[] newArray = new int[dataArray.length*2];
        for(int i=0; i<this.dataArray.length; i++){
            newArray[i]=dataArray[i];
        }
        this.dataArray=newArray;
    }


    public int get(int index){
        return dataArray[index-1];
    }


    public void remove(int initialIndex){
            for(int i=initialIndex; i<this.dataArray.length; i++){
                this.dataArray[i-1]=this.dataArray[i];
            }
        this.size--;
    }

    public void printAll(){
        for(int i=0; i<this.size; i++){
            System.out.print(this.dataArray[i]);
            if(i==size-1){
                System.out.print(".");
            }else{
                System.out.print(", ");
            }
        }
        System.out.println("\n\n");
    }

}
