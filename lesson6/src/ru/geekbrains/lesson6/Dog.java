package ru.geekbrains.lesson6;

public class Dog extends Animal{
    private final int runMax=500;
    private final int swimMax=10;
    private String name;
    private static int count;

    public Dog(String name) {
        super(name);
        this.name = name;
        count++;
    }

    public static int getCountDog() {
        return count;
    }

    @Override
    public void run(int d){
        if (d >= 0 && d <= runMax){
            System.out.printf("%s пробежал %d%n", this.name, d);
        } else if (d > runMax) {System.out.println("Собака не может столько пробежать");}
        else {
            System.out.println("Расстояние не может быть отрицательным");
        }
    }

    @Override
    public void swim(int d){
        if (d > 0 && d <= swimMax){
            System.out.printf("%s проплыл %d%n", this.name, d);
        } else if (d > swimMax) {System.out.println("Собака не может столько проплыть");}
        else {
            System.out.println("Расстояние не может быть отрицательным");
        }
    }
}
