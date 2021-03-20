package ru.geekbrains.prev;

public class Plate {
    private final int capacity = 10;
    private int size = capacity;

    public boolean reduceFood(int request) {
        if (request > size) {
            return false;
        }
        size -= request;
        return true;
    }

    public void increaseFood() {
        size = capacity;
    }

    public void increaseFood(int amount) {
        int temp = size += amount;
        size = Math.min(temp, capacity);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "capacity=" + capacity +
                ", size=" + size +
                '}';
    }
}
