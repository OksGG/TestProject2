package io.gusakova;

public class Test4 {
    public static void main(String[] args) {
//прогрессия арифметическая
        int n = 10; // число последовательностей
        int start = 4; // начальное число
        int additive = 2; //шаг прогреcсии
        System.out.println("Арифметическая");
        for (int i = 0; i <= n; i++, start += additive) {
            System.out.println(" " + start);
        }
// геометрическая
        n = 10;
        start = 4;
        additive = 2;
        System.out.println("Геометрическая");
        for (int i = 0; i <= n; i++, start *= additive) {

            System.out.println(" " + start);
        }

    }
}
