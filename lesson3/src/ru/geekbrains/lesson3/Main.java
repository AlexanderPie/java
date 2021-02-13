package ru.geekbrains.lesson3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playGuessNum();
        playGuessWord();
    }

    public static void playGuessNum (){
        Scanner sc = new Scanner(System.in);
        int p=1;
        do {
            int num = (int)(Math.random()*10);
            if (p==1){guessNum(num);}
            System.out.println("Сыграть еще раз? (1/0)");
            p=sc.nextInt();
        } while (p==1);
    }
    public static void guessNum (int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.println("Введите число");
            int a = sc.nextInt();
            if (a == n) {
                System.out.println("Вы угадали");
                break;
            } else if (a>n){
                System.out.println("Ваше число больше");
            } else if (a<n) {
                System.out.println("Ваше число меньше");
            }
        }
    }

    public static void playGuessWord() {
        Scanner sc = new Scanner(System.in);
        boolean b =true;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int n=(int)(Math.random()*25);
        String w = words[n];
        System.out.println(w);
        while (b) {
            System.out.println("Введите слово");
            String str = sc.nextLine();
            if (str.equalsIgnoreCase(w)){b=false;
                System.out.println("Верно");
            } else {
                int l1=str.length();
                int l2=w.length();
                int l=(l1<l2)?l1:l2;
                char [] itog ={'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',};
                for (int i=0; i<l; i++) {
                    char letterstr = str.charAt(i);
                    char letterw = w.charAt(i);
                    if (letterstr == letterw) {
                        itog[i] = letterstr;
                    }

                }
                for (int j=0; j<15; j++){
                    System.out.print(itog[j]);
                }
                System.out.println();
            }

        }
    }
}
