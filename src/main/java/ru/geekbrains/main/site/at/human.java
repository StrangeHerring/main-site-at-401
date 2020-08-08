package ru.geekbrains.main.site.at;

public class human {
    public human(int runLimit, int jumpLimit){
    }

    public void humanRun(){
        System.out.println("Человек бежит");
    }

    public void humanJump(){
        System.out.println("Человек прыгает");
    }

    public void action(){
        humanRun();
        humanJump();
    }
}
