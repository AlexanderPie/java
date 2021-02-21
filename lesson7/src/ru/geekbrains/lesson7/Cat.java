package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate p){
        this.satiety = p.decreaseFood(this.appetite);
        return this.satiety;
    };
}
