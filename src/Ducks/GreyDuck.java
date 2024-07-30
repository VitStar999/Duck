package Ducks;

public class GreyDuck extends Duck implements DuckSwim, DuckFly {
    @Override
    public void fly() {
        System.out.println(" I can fly");
    }

    @Override
    public void swim() {
        System.out.println(" I can swim ");
    }

    @Override
    public void display() {
        System.out.println(" \tСіра качка:");
        quack();
        eat();
        sleep();
        fly();
        swim();
    }
}


