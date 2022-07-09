package org.patychavez.arraypractice.infinitearray;

import java.util.Scanner;

public class MainListPaty {
    MenuRequester menuRequester;

    public MainListPaty(){
        Scanner input = new Scanner(System.in);
        ListPaty listPaty = new ListPaty();
        menuRequester = new MenuRequester(listPaty, input);
    }

    public void main() {

        this.menuRequester.menu();

    }
}
