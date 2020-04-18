package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int heap=20;  //количество оставшихся спичек
        Print print = new Print();
        Logic logic = new Logic();
        int moveComp=0;  //количество спичек выбранное компютером
        int movePlayer=0; //количество спичек выбранное игроком

        //пока количество спичек в куче больше одной
        while (heap>1){
            print.printHeap(heap);
            moveComp=logic.computerMove(heap);
            print.printKomp(moveComp);
            heap -= moveComp;
            print.printHeap(heap);
            if (heap==1){
                print.printEnd();
                break;
            }
            print.printPlayer();
            movePlayer= in.nextInt();

            //проверка корректности введенных данных
            while (movePlayer>3 || movePlayer<=0) {
                print.printEror();
                print.printPlayer();
                movePlayer= in.nextInt();
            }
            heap -= movePlayer;
        }
    }
}
