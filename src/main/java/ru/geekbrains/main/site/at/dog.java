package ru.geekbrains.main.site.at;

public class dog {
    public dog(int runLimit, int jumpLimit){
    }

    public void dogRun(){
        System.out.println("Собака бежит");
    }

    public void dogJump(){
        System.out.println("Собака прыгает");
    }

    public void action(){
        dogRun();
        dogJump();
    }
}
