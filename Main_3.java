package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1. Načtěte celočíselnou hodnotu -> pomocí konstrukce 'switch'
        // vyberte odpovídající měsíc (např.: 1 -> Leden, 2 - Únor, etc..) a vypište (pokud je hodnota mimo rozsah, vypište "Neplatná hodnota")
        System.out.print("Zadejte měsíc: ");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Leden");
                break;
            case 2:
                System.out.println("Únor");
                break;
            case 3:
                System.out.println("Březen");
                break;
            case 4:
                System.out.println("Duben");
                break;
            case 5:
                System.out.println("Květen");
                break;
            case 6:
                System.out.println("Červen");
                break;
            case 7:
                System.out.println("Červenec");
                break;
            case 8:
                System.out.println("Srpen");
                break;
            case 9:
                System.out.println("Září");
                break;
            case 10:
                System.out.println("Říjen");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Prosinec");
                break;
            default:
                System.out.println("Neplatná hodnota");
        }

        // 2. Vypočet faktoriálu vámi zadaného čísla. Výsledek vypiště. - Řeště pomocí 'for' cyklu
        System.out.print("Zadejte číslo:");
        int fac = sc.nextInt();
        int result = 1;
        for (int i = fac; i != 0; i--) {
            result *= i;
        }
        System.out.println("Faktoriál je: " + result);

        // 3. Proveďte celočíselné dělení vámi zadného dělence a dělitele. - Řeště pomocí 'while' cyklu
        System.out.print("Zadejte delenec: ");
        int delenec = sc.nextInt();
        System.out.print("Zadejte delitel: ");
        int delitel = sc.nextInt();
        result = 0;
        while (delenec >= delitel) {
            result++;
            delenec -= delitel;
        }
        System.out.println("Výsledek dělení: " + result);
        System.out.println("Zbytek: " + delenec);

        // 4. Najdětě největšího společného dělitele dvou čísel - pomocí 'do while' cyklu
        System.out.print("Zadejte první číslo: ");
        int firstN = sc.nextInt();
        System.out.print("Zadejte druhé číslo: ");
        int secondN = sc.nextInt();
        int div = firstN > secondN ? secondN : firstN;

        if (secondN % firstN != 0 && firstN % secondN != 0) {
            // div = div ^ (1 / 2); cuts out a lot of numbers, but isn't really suited for 'do while'
            do {
                div--;
            } while (firstN % div != 0 || secondN % div != 0);
        }
        System.out.println("Největší společný dělitel je: " + div);
    }
}
