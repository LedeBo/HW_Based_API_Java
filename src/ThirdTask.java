import java.util.Scanner;

/*
2.  Реализовать простой калькулятор
 */

public class ThirdTask {
    double a;
    double b; 
    double result;

        public void getResult() {
            System.out.println("Введите первое число:");
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();        
            System.out.println("Введите второе число:");            
            b = in.nextDouble();            
            System.out.println("Введите операцию:");
            char operation = in.next().charAt(0);

        result = 0;
        
        switch (operation){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            }
    System.out.println("Результат операции: " + result);
    in.close();
    
    }
}
