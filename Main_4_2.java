package com.company;

import java.util.Scanner;


public class Main {
    private static final int SHOTS_NUM = 6;

    public static void main(String[] args) {
        boolean hrajePocitac = true;
        int poziceKulkyVBubinku = (int) (Math.random() * SHOTS_NUM); // pozice kulky v šestiranném bubínku revolveru
        System.out.println("Roztočení bubínku... Cvak!");
        int poziceBubinku = (int) (Math.random() * SHOTS_NUM); // říká, který z otvorů bubínku je vybrán ke střelbě
        Scanner sc = new Scanner(System.in);

        System.out.println("Hraje PC");

        while (poziceKulkyVBubinku != poziceBubinku) {
            System.out.println("Nic!");
            poziceBubinku = (poziceBubinku + 1) % SHOTS_NUM;
            hrajePocitac = !hrajePocitac;
            if (hrajePocitac) {
                System.out.println("Hraje PC");
            } else {
                System.out.println("Hraješ ty");
                System.out.println("Zmáčkni spoušť (enter) ");
                sc.nextLine(); // player just needs to press it we don't care about input
            }
        }

        System.out.println("Bum!");

        if (hrajePocitac) {
            System.out.println("Vyhrál jsi! :)");
        } else {
            System.out.println("Prohrál jsi :(");
        }

        // -- dodatečné úkoly --
        // přidat čekání na akci (zmáčknutí spouště) uživatele
        // předělat magickou konstantu 6 na pojmenovanou konstantu a zkoušet hru s různými počty otvorů v revolveru
        // předělat hru na extrémnější variantu, kde se od druhého pokusu už netočí a jde se dál,
        // - tady potřeba napojit konec bubínku na začátek bubínku, aby se pořád otáčel dokola (int proměnná, co se bude zvyšovat a pak modulo % nebo nulování za koncem)
    }

}
