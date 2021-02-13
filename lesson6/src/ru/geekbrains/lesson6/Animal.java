package ru.geekbrains.lesson6;

public abstract class Animal {
    private String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCountAn() {
        return count;
    }

    public abstract void run(int dist);
    public abstract void swim(int dist);

}
