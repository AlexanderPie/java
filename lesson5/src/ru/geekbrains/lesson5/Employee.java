package ru.geekbrains.lesson5;

public class Employee {
    private String fio;
    private String pos;
    private String email;
    private String phone;
    private int salary;
    protected int age;

    public Employee (String fio, String position, String email, String phone, int salary, int age){
        this.fio = fio;
        this.pos = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + pos);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
