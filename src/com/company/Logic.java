package com.company;

public class Logic {
    private int loss = 17;//проигрышное число
    private int lim = 4; //период через который выпадает проигрышное число
    //метод возвращает очередное проигрышное число
    public int computerMove( int heap ){
        int rez = heap - loss;
        loss-=lim;
        return rez;
    }
}
