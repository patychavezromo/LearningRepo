package org.patychavez.lists.linkedlistpaty;

import java.util.Scanner;

public class LinkedList {

    private Node root;
    private Node beforeNode;
    Scanner input= new Scanner(System.in);

    public LinkedList(){
        this.root= null;
        this.beforeNode= null;
    }


    public void menu() {
        int option=0;
        do {
            System.out.println("SELECT AN OPTION\n");
            System.out.println("1. add\n" +
                    "2. delete\n" +
                    "3. get\n" +
                    "4. modify\n" +
                    "5. print all\n");
            option = input.nextInt();
            input.nextLine();
            execute(option);
        }while (option<6);
    }

    public void execute(int option){
        switch (option){
            case 1:
                System.out.print(" enter the value for the node");
                int dataToAdd= input.nextInt();
                input.nextLine();
                add(dataToAdd);
                break;
            case 2:
                System.out.println(" indicates the value to remove");
                int valueToRemove= input.nextInt();
                remove(valueToRemove);
                break;
            case 3:
                System.out.println(" index of the node you want to get");
                int indexToGet= input.nextInt();
                int value=get(indexToGet);
                System.out.println(value);
                break;
            case 4:
                System.out.println(" modify node value\n");
                int valueToModify= input.nextInt();
                input.nextLine();
                modify(valueToModify);
                break;
            case 5:
                System.out.print(" display full list\n");
                printAll();
                break;
        }
    }



    public void add(int data){
        Node newNode = new Node();
        newNode.setValue(data);
        if (this.root==null){
            this.root=newNode;
        } else {
            Node lastNode = getLast();
            lastNode.setNext(newNode);
        }

    }

    private Node getLast(){
        Node currentNode= this.root;
        while(currentNode.getNext()!= null) {
            currentNode= currentNode.getNext();
        }
        return currentNode;
    }


    public int get(int index){
        index= index-1;
        Node currentNode=this.root;
        for(int i=1; i<=index; i++){
            currentNode=currentNode.getNext();
        }
        return currentNode.getValue();
    }


    public void remove(int value){
        Node currentNode = this.root;
        this.beforeNode=null;
        while (currentNode != null){
            if(currentNode.getValue() == value){
                if(currentNode==this.root){
                    this.root=currentNode.getNext();
                }else{
                    beforeNode.setNext(currentNode.getNext());
                }
            }
            this.beforeNode=currentNode;
            currentNode= currentNode.getNext();
        }
    }

    public void modify(int value){
        Node currentNode = this.root;
        while(currentNode != null){
            if(currentNode.getValue()==value){
                System.out.print(" indicates the new value for the node");
                int newValue= input.nextInt();
                currentNode.setValue(newValue);
            }
            currentNode=currentNode.getNext();
        }
    }


    public void printAll(){
        Node currentNode = this.root;
        if(currentNode != null){
            while(currentNode != null) {
                System.out.println(currentNode.getValue());
                currentNode = currentNode.getNext();
            }
        }else{
            System.out.println("\n the list is empty \n");
        }
    }

}
