package com.company;

import java.util.Arrays;

public class Main {

    public static boolean vloz(int prvek, int x, int y, int[][] pole) {
        // TODO vlozi do pole prvek na pozici x, y
        // zkontroluj, zda se nevklada mimo rozsah pole
        // navratova hodnota = uspesnost vkladani

        //Priklad:
        //vypis(pole)
        // 1    2   3
        // 4    5   6
        // 7    8   9
        // vloz(45, 1 , 1, pole)
        //vypis(pole)
        // 1    2   3
        // 4    42  6
        // 7    8   9
        if (y < pole.length && y >= 0 && x < pole[0].length && x >= 0) {
            pole[y][x] = prvek;
            return true;
        }
        return false;
    }

    public static void line(int len) {
        System.out.print(" |\n");
        for (int i = 0; i <= len; i++) {
            System.out.print("____");
        }
        System.out.println();
    }

    public static void vypis(int[][] pole) {
        // vypise 2D pole do konzole

        //Priklad:
        //vypis(pole)
        // 1    2   3
        // 4    5   6
        // 7    8   9
        for (int row = 0; row < pole.length; row++) {
            for (int cell = 0; cell < pole[row].length; cell++) {
                System.out.print(" | " + pole[row][cell]);
            }
            line(pole[row].length);
        }
        System.out.println();
    }

    public static int[][] inicializace(int velikost) {
        // TODO vytvořte pole jako symetricke 2D pole
        // naplnte hodnotami násobků čísel

        // Priklad stavu po inicializaci:
        //pole = inicializace(3)
        //vypis(pole)
        // 1    2   3
        // 2    4   8
        // 3    6   9
        int[][] pole = new int[velikost][velikost];
        for (int i = 1; i <= velikost; i++) {
            for (int j = 1; j <= velikost; j++) {
                pole[i - 1][j - 1] = i * j;
            }
        }
        return pole;
    }


    public static void main(String[] args) {
        // Implementujte operace nad 2D polem viz. popis u metod

        // Inicializujte 2D pole, vypiste, upravte stav pomoci operace vloz(), vypiste
        int[][] pole = inicializace(3);
        vypis(pole);
        vloz(5, 1, 1, pole);
        vypis(pole);
        vloz(8, 1, 5, pole);
        vypis(pole);


    }
}
