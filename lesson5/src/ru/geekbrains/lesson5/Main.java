package ru.geekbrains.lesson5;

public class Main {

    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("fio1","engineer", "abc@abc.com", "1234", 60, 30);
        arr[1] = new Employee("fio2","developer", "def@def.com", "5678", 100, 25);
        arr[2] = new Employee("fio3","engineer", "abc11@abc.com", "1557", 50, 50);
        arr[3] = new Employee("fio4","manager", "mng@abc.com", "5530", 150, 41);
        arr[4] = new Employee("fio5","economist", "eee@abc.com", "1111", 50, 32);

        for (int i = 0; i < 5; i++){
            if (arr[i].age > 40){
                arr[i].info();
            }
        }
    }
}
