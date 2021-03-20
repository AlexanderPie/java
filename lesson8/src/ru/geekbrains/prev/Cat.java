package ru.geekbrains.prev;

public class Cat {
    private final String name;
    private boolean isFedUp;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        isFedUp = plate.reduceFood(3);
        if (isFedUp) {
            System.out.println("Cat is fed up.... fine.");
        } else {
            System.out.println("There is no enough food for the cat... So, pity :(");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", isFedUp=" + isFedUp +
                '}';
    }
}
