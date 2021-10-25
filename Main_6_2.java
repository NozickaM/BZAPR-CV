package com.company;


import java.util.Arrays;

public class Main {
    public static class SpravcePole {
        int[] pole;
        int delkaPole;

        public SpravcePole(int delkaPole) {
            this.delkaPole = delkaPole;
            fillPole();
        }

        public int min() {
            int result = 9999999;
            for (int i = 0; i < delkaPole; i++) {
                if (result > this.pole[i]) {
                    result = this.pole[i];
                }
            }
            return result;
        }

        public int max() {
            int result = 0;
            for (int i = 0; i < delkaPole; i++) {
                if (result < this.pole[i]) {
                    result = this.pole[i];
                }
            }
            return result;
        }

        public double avg() {
            int result = 0;
            for (int i = 0; i < delkaPole; i++) {
                result += this.pole[i];
            }
            result = result / this.pole.length;
            return result;
        }
        public int sum() {
            int result = 0;
            for (int i = 0; i < delkaPole; i++) {
                result += this.pole[i];
            }
            return result;
        }
        public void fillPole() {
            this.pole = new int[delkaPole];
            for (int i = 0; i < delkaPole; i++) {
                this.pole[i] = (int) (Math.random() * 101);
            }
        }

        @Override
        public String toString() {
            return "pole: " + Arrays.toString(pole) +
                    ", delkaPole: " + delkaPole + ", min: " + min() + ", max: " + max() + ", avg: " + avg()+", suma: "+sum();
        }
    }
    // Vytvoři třídu SpravcePole
    // Třída bude obsahovat funkčnosti z minulého cvičení, příklad Cv1

    // atributy
    // int [] pole

    // konstruktor
    // parametr - int delkaPole
    // na základe delkaPole, inicializuje promenou pole nahododnými cisly od 0-100
    // funkce (viz 5. cviceni Cv1)
    // int max()
    // int min()
    // int suma()
    // double prumer()
    // String toString() - vrátí String reprezentaci pole (vypis prvku).. napr "[2, 4, 8 , 9, 1]"

    public static void main(String[] args) {
        SpravcePole arr = new SpravcePole(10);
        System.out.println(arr.toString());
    }
}
