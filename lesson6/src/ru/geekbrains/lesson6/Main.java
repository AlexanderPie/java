package ru.geekbrains.lesson6;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik"),
                new Dog("Bobik")
        };
        for (Animal i: animals){
            i.run(150);
            i.run(600);
            i.swim(5);
            i.swim(15);
        }
        System.out.println("Животных всего " + Animal.getCountAn());
        System.out.println("Котов всего " + Cat.getCountCat());
        System.out.println("Собак всего " + Dog.getCountDog());
    }
}
