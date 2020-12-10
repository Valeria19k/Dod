package com.company;

public class Dalmatian extends Dog {
    Dalmatian(){

    }
    Dalmatian(String name, int age, int satiety, int sleepiness){
        this.name=name;
        this.age=age;
        this.satiety=satiety;
        this.sleepiness=sleepiness;
    }

    public void description(){
        System.out.println("Собака породы Далматинец. Худощавые, но сильные и мускулистые животные с эстетичным и пропорциональным телосложением. Морда вытянутая, уши сложены. Конечности чуть длиннее среднего, грудная клетка выраженная, как и брюшная впадина. Шерсть короткая, мягкая, густая и блестящая. Окрас белый в чёрное пятно.");
    }
}
