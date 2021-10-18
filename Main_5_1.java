package com.company;

import java.util.Arrays;

public class Main {

    public static int[] min_max(int[] array) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return new int[]{min, max};
    }

    public static int[] sum_avg(int[] array) {
        int sum = 0, avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        return new int[]{sum, avg};
    }

    public static void main(String[] args) {
        // Vytvorte 1D pole1 o velikosti 10 s čísly 1-10
        // Vytvorte 1D pole2 o velikosti 10 s náhodnými čísli 0-10
        int[] pole1 = new int[10];
        int[] pole2 = new int[10];
        for (int i = 1; i <= 10; i++) {
            pole1[i - 1] = i;
            pole2[i - 1] = (int) (Math.random() * 11);
        }


        // Vytvořte funkce zjistujici minimální hodnotu prvku v poli,
        // sumu a průměru prvků
        // Vypočítané hodnoty vypiště do konzole

        System.out.println("Pole1: " + Arrays.toString(pole1));
        System.out.println("Pole2" + Arrays.toString(pole2));
        int[] min_maxV = min_max(pole1);
        System.out.println("Minimalni prvek pole1: " + min_maxV[0]);
        System.out.println("Maximalni prvek pole1: " + min_maxV[1]);
        min_maxV = min_max(pole2);
        System.out.println("Minimalni prvek pole2: " + min_maxV[0]);
        System.out.println("Maximalni prvek pole2: " + min_maxV[1]);
        int[] sum_avgV = sum_avg(pole1);
        System.out.println("Suma prvku pole1: " + sum_avgV[0]);
        System.out.println("Prumer prvku pole1: " + sum_avgV[1]);
        sum_avgV = sum_avg(pole2);
        System.out.println("Suma prvku pole2: " + sum_avgV[0]);
        System.out.println("Prumer prvku pole2: " + sum_avgV[1]);


    }
}
