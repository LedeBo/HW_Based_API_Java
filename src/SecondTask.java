/*
2.  Вывести все простые числа от 1 до 1000
 */

public class SecondTask {

    
    // public void simpleNumber() {
    //     for (int i = 2; i <=1000; i++) {
    //         boolean Yes = true;
    //         for (int j = 2; j < i; j ++) {
    //             if (i % j == 0) {
    //                 Yes = false;
    //                 break;
    //             }
    //         }

    //         if(Yes) {
    //             System.out.println(i);
    //         }
    //     }
    
            public boolean simpleNumber(int number) {
              
                for (int i = 2; i * i <= number; i++) {
                        if (number % i == 0) {
                            return false;
                        }
                    }
                    return true;
                }
             
            public void simpleNum() {
                for (int number = 2; number <= 1000; number++) {
                    if (simpleNumber(number)) {
                    System.out.println(number);
                        }
                    }
            }

    }
    
// }

