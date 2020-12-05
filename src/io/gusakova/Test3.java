package io.gusakova;

public class Test3 {
    public static void main(String[] args) {
//вывод таблицы умножения
        int a;
        int b;
        System.out.println("Таблица умножения");
        System.out.printf(" * |");
        for (a = 2; a < 10; a++)
            System.out.printf("%2d ", a);
        System.out.printf("\n---|------------");
        System.out.printf("----------------\n");
        for (a = 2; a < 10; a++) {
            System.out.printf("%2d |", a);
            for (b = 2; b < 10; b++)
                System.out.printf("%2d ", a * b);
            System.out.printf("\n");
        }

    }
}
