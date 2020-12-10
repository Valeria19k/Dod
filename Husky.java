package com.company;

public class Husky extends Dog {
    Husky(){

    }
    Husky(String name, int age, int satiety, int sleepiness){
        this.name=name;
        this.age=age;
        this.satiety=satiety;
        this.sleepiness=sleepiness;
    }

    public void description(){
        System.out.println("Собака породы Хаски. Средней компактности, спина прямая и крепкая, грудь умеренно широкая, глубокая, сильная, поясница крепкая, круп слегка скошенный. Палитра окраса разнообразна: от чисто-белого до черного, возможны отметины на туловище и рисунки на голове.");
    }
}
