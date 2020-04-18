package com.company;

public class Print {

    public void printHeap(int n){
        System.out.println("\n На столе осталось "+ n + " спичек.");
    }
    public void printKomp(int n){
        System.out.print(" - Количество выбранных компютером спичек = " + n + ".");
    }
    public void printPlayer(){
        System.out.print(" - Ход игрока. Введите количество спичек : " );
    }
    public void printEror(){
        System.out.println("Некорректное количество спичек!");
    }
    public void printEnd(){
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
