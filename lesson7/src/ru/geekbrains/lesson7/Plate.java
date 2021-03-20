package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info (){
        System.out.println("Plate: " + this.food);
    }

    public boolean decreaseFood (int n) {
        boolean b = (n <= this.food);
        if (b) {
            this.food -= n;
        }
        return b;
    }

    public void addFood(int n){
        this.food += n;
    }
}
