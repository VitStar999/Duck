package Ducks;

public class RedDuck extends Duck implements DuckSwim {
    @Override
    public void swim() {
        System.out.println(" I can swim ");
    }

    @Override
    public void display() {
        System.out.println(" \tЧервона качка:");
        quack();
        eat();
        sleep();
        swim();
    }
}
