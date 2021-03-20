package ru.geekbrains.lesson7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat ("Barsik", 10),
                new Cat ("Murzik", 20)
        };

        Plate p = new Plate(15);
        p.info();

        for (Cat o: cats){
            System.out.printf("Кот %s, сытость %s%n", o.getName(), o.eat(p));
        }
    }
}
