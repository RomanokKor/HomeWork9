package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double sum = 0;
        System.out.println("Введите размер массива");
        Scanner s = new Scanner(System.in);
        double[] mass = new double[s.nextInt()];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите элемент массива №" + (i + 1));
            mass[i] = s.nextDouble();
            sum = sum + mass[i];

        }
        System.out.println("Среднее арифметическое: " + (sum / mass.length));
        for (double x : mass) {
            System.out.println((sum / mass.length) * x);
            
        }
    }
}
