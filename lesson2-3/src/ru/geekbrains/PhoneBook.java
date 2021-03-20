package ru.geekbrains;

import java.util.*;

public class PhoneBook {
    private final Map<String, Set<String>> phonebook = new HashMap<>();

    public void add(String name, String phonenumber){
        if (phonebook.containsKey(name)){
            phonebook.get(name).add(phonenumber);
        } else {
            Set<String> num = new HashSet<>();
            num.add(phonenumber);
            phonebook.put(name, num);
        }
    }

    public Set<String> get(String name){
        if (phonebook.containsKey(name)) {
            return phonebook.get(name);
        } else {
            return Collections.emptySet();
        }
    }

}

