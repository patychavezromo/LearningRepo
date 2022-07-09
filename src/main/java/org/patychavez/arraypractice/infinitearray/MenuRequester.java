package org.patychavez.arraypractice.infinitearray;

import java.util.Scanner;

public class MenuRequester {

    ListPaty listPaty;
    Scanner input;

    public MenuRequester(ListPaty listPaty, Scanner input){
        this.listPaty = listPaty;
        this.input= input;
    }



    public void menu(){
        boolean follow=true;
        do{
            System.out.println("choose the menu option:\n"+
            "option 1: add numerical data\n"+
            "option 2: get information\n"+
            "option 3: delete data\n"+
            "option 4: print all\n"+
            "option 5: Get out of the system");
            int option= this.input.nextInt();
            this.input.nextLine();
            if(option==5){
                follow=false;
            }
            run(option);
        }while (follow);
    }


    public void run(int option){
        switch (option){
            case 1:
                System.out.println("add number: ");
                int numberAdd = this.input.nextInt();
                this.input.nextLine();
                this.listPaty.add(numberAdd);
                break;
            case 2:
                System.out.println("return the value found at position:");
                int numberToGet= this.input.nextInt();
                this.input.nextLine();
                int number=this.listPaty.get(numberToGet);
                System.out.println(number);
                break;
            case 3:
                System.out.println("remove the value found at position:");
                int numberRemove= this.input.nextInt();
                this.input.nextLine();
                this.listPaty.remove(numberRemove);
                break;
            case 4:
                this.listPaty.printAll();
                break;
            case 5:
                System.out.println("Get out of the system");
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }
}
