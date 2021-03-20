package ru.geekbrains.lesson6;

public class Cat extends Animal {
    private final int runMax=200;
    private final int swimMax=0;
    private static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    public static int getCountCat() {
        return count;
    }

    @Override
    public void run(int d){
        if (d >= 0 && d <= runMax){
            System.out.printf("%s пробежал %d%n", this.name, d);
        } else if (d > runMax) {System.out.println("Кот не может столько пробежать");}
        else {
            System.out.println("Расстояние не может быть отрицательным");
        }
    }

    @Override
    public void swim(int d){
        System.out.println("Кот не умеет плавать");
    }
}
