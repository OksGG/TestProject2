package io.gusakova;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//описание введеного числа: Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if((a>0) & (a % 2 == 0)){
            System.out.println(a +" положительное и четное");
        }else if((a==0) & (a % 2 == 0)) {
            System.out.println(a + " нулевое и четное");
        }else if((a<0) & (a % 2 == 0)) {
            System.out.println(a + " отрицательное и четное");
        }
        else if((a>0) & (a % 2 != 0)) {
            System.out.println(a + " положительное и нечетное");

        }else{
            System.out.println(a + " отрицательное и нечетное");
        }
    }
}
