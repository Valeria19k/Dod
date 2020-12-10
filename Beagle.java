package com.company;

public class Beagle extends Dog {
    Beagle(){

    }
    Beagle(String name, int age, int satiety, int sleepiness){
        this.name=name;
        this.age=age;
        this.satiety=satiety;
        this.sleepiness=sleepiness;
    }

    public void description(){
        System.out.println("Собака породы Бигль. Очаровательные бигли отличаются длинными ушами, которые доходят до кончика носа собаки. Мускулистое тело, большие глаза, мощные челюсти, довольно широкая грудная клетка, круглые лапы и высоко расположенный, толстый хвост — все это характерные черты бигля.");
    }
}
