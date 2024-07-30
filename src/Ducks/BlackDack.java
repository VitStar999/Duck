package Ducks;

public class BlackDack extends Duck implements DuckFly {
    @Override
    public void fly() {
        System.out.println(" I can fly");
    }

    @Override
    public void display() {
        System.out.println(" \tЧорна качка:");
        quack();
        eat();
        sleep();
        fly();
    }
}
