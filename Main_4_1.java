package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        int nahodneCislo = (int) (Math.random() * 100) + 1;
        System.out.println("cislo " + nahodneCislo);
        System.out.print("Hádej číslo 1-100: ");
        int hadaneCislo = vstup.nextInt();
        int counter = 1;
        int limit = 12;
        boolean success = true;

        while (hadaneCislo != nahodneCislo) {
            counter++;
            if (hadaneCislo < nahodneCislo) {
                System.out.print("Zkus větší číslo: ");
            } else {
                System.out.print("Zkus menší číslo: ");
            }
            hadaneCislo = vstup.nextInt();
            if (counter >= limit) {
                success = false;
                break;
            }
        }
        if (success) {
            System.out.println("Uhodl jste číslo");
        } else {
            System.out.println("Nepodařilo se vám uhodnout číslo v daném limitu. ");
        }
        System.out.println("Pocet pokusu: " + counter);
        System.out.println("Hádané číslo bylo: " + hadaneCislo);
    }
    // přidat počítadlo pokusů, aby se na konci šlo vypsat na kolikátý pokus
    // přidat ukončení hry neúspěchem, pokud to nestihne za nějaký počet pokusů
}
