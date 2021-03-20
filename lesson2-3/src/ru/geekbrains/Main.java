package ru.geekbrains;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] arrW = {"Apple", "Orange", "apple", "Apple", "Nut", "Peach", "Banana", "Pear", "Pear", "Apple"};
        doWords(arrW);
    }

    public static void doWords(String[] array){
        Map<String, Integer> counter = new HashMap<>();
        Set<String> unique = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            unique.add(array[i]);
            if (counter.containsKey(array[i])){
                counter.put(array[i], counter.get(array[i]) + 1);
            } else {
                counter.put(array[i], 1);
            }
        }
        System.out.println(unique);
        System.out.println(counter);
    }

    public static void doPhoneBook(){
        PhoneBook book = new PhoneBook();
    }
}
