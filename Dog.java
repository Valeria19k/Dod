package com.company;

public abstract class Dog {
    public String name;
    public int age;
    public int satiety;
    public int sleepiness;
    Dog(){

    }
    Dog(String name, int age, int satiety, int sleepiness){
        this.name=name;
        this.age=age;
        this.satiety=satiety;
        this.sleepiness=sleepiness;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSleepiness(int sleepiness) {
        this.sleepiness = sleepiness;
    }

    public int getSleepiness() {
        return sleepiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void food(){
        System.out.println("Собака накормлена!");
        satiety++;
    }

    public void eat(){
        if(satiety<7){
            food();
        }
        System.out.println("Шкала сытости : "+satiety+".");
    }

    public void sleep(){
        System.out.println("Собака поспала!");
        sleepiness++;
    }

    public void rest(){
        if(satiety<7){
            sleep();
        }
        System.out.println("Шкала отдыха : "+sleepiness+".");
    }

    public abstract void description();
}
