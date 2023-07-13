
package hw3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение

*/

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            int N = iScanner.nextInt();
            int min = ar.get(0);
            int max = ar.get(0);
            float sum = 0;
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + ar.get(i));
                    ar.remove(i);
                }
            for (int a = 0; a< ar.size(); a++) {
                 int num = ar.get(a);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            // public static void midsum() {
            //     midsum = sum/ar.size();
                
            }
            Float midsum = sum / ar.size();
            
            }
            
            Collections.sort(ar);
            System.out.println("Список с удаленными четными числами: \n " + ar);
            System.out.println("Минимальное значение: " + min);

            System.out.println("Максимальное значение: " + max);

            System.out.println("Среднее арифметическое значение: " + midsum);

        }
    
}
