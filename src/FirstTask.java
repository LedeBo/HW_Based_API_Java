import java.util.Scanner;
/*
1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),
 n! (произведение чисел от 1 до n)
 */

public class FirstTask {

    int n;
    int sum;
    int fakt;

    public FirstTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n");
        n = in.nextInt();
        sum = 0;
        fakt = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fakt *= i;
        in.close();
        }

    }


    public void triangleOutput() {
      
        System.out.println("сумма чисел от 1 до" +  n + "равна"  +  sum);
    }
    public void faktorialOutput() {      
        
        System.out.println("факториал числа" + n + "равен" + fakt);
    }
}
