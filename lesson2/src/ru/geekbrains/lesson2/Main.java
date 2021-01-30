package ru.geekbrains.lesson2;

public class Main {

    public static void main(String[] args) {
    int [] arr = {1, 0, 1, 1, 1, 0, 0, 1};
    int [] arr1 = new int[8];
    int [] arr2 = {1,5,3,2,11,4,5,2,4,8,9,1};
    int [] b = {1,2,3,4,5,4,3,2,1,0,-10};
    int [] checkBalance = {1,1,2,4};
    int Shift [] = {1,2,3,4,5,6};
    int n = 5;
    int m=14;
    int [][] arrd = new int [5][5];
    /* 1.	Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
     */
    for (int i=0; i<8; i++){
        if (arr[i]==1){arr[i]=0;}
        else if (arr[i]==0){arr[i]=1;}
        System.out.print(arr[i] + " ");
        }

    System.out.println();

    /*2.	Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    for (int i=0; i<8; i++){
        arr1[i]=i*3;
        System.out.print(arr1[i] + " ");
    }

    System.out.println();

    /* 3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    for (int i=0; i<arr2.length; i++){
        if (arr2[i]<6){arr2[i]*=2;}
        System.out.print(arr2[i] + " ");
    }

    System.out.println();

    /* 4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            if ((i==j) || ((i+j)==(n-1))){arrd[i][j]=1;
            } else {arrd[i][j]=0;}
            System.out.print(arrd[i][j] + " ");
        }
        System.out.println();
    }
    doTask5(b);
    System.out.println(doTask6(checkBalance));
    doTask7(Shift, m);
    }

    public static void doTask5(int array[]){
        int min = array[0];
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i]>max){max=array[i];}
            if (array[i]<min){min=array[i];}
        }
            System.out.println("Минимальный = " + min + ", " + "Максимальный = " + max);
    }

    public static boolean doTask6(int array[]) {
        int sumLeft = 0;
        int sumRight = 0;
        int n = array.length;
        int Sum = 0;
        boolean q=false;
        for (int i = 0; i < n; i++) {
            Sum += array[i];
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                sumLeft += array[k];
            }
            sumRight = Sum - sumLeft;
            if (sumLeft == sumRight){q=true;}
            sumLeft=0;
            sumRight=0;
        }
        return q;
    }

    public static void doTask7(int array[], int m){
        int len=array.length;
        int c;
        m=m%len;
        for (int j=0; j<m; j++) {
            c = array[j];
            array[j] = array[len-m+j];
            for (int i = (len - m+j); i> m; i = i - m) {
                array[i]=array[i-m];
            }
            array[j+m]=c;
        }
        for (int i=0; i<len; i++){
            System.out.print(array[i] + " ");
        }
    }
}
