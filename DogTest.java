package com.company;

public class DogTest {
    public static void main (String[] args){
        Husky a= new Husky("Амур",2,6,7);
        Beagle k= new Beagle("Ума",4,5,4);
        Dalmatian l= new Dalmatian("Микки",7,8,7);
        a.description();
        k.description();
        l.description();
        k.eat();
        l.rest();
    }
}
