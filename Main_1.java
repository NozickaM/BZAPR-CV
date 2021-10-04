package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Cv1 exercises
        System.out.print("Gallons: ");
        double gallons = input.nextDouble();
        System.out.println("Litres: " + gallons * 3.7854);

        System.out.print("Kilos on Earth: ");
        double kilos = input.nextDouble();
        System.out.println("Kilos on the Moon: " + kilos * 0.17);

        System.out.print("Circle radius: ");
        double radius = input.nextDouble();
        System.out.println("Circle circumference: " + 2 * Math.PI * radius);
        System.out.println("Circle area: " + Math.PI * Math.pow(radius, 2));

        // Cv2 exercises
        System.out.print("Jméno a Příjmení: ");
        input.nextLine(); // consume new line
        String name = input.nextLine();
        System.out.println("Jméno: " + name);

        System.out.print("Zadejte číslo: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Cislo je kladne.");
        } else if (num == 0) {
            System.out.println("Cislo je nula.");
        } else {
            System.out.println("Cislo je zaporne.");
        }

        System.out.print("cislo 1: ");
        int numF = input.nextInt();
        System.out.print("cislo 2: ");
        int numS = input.nextInt();
        System.out.print("cislo 3: ");
        int numT = input.nextInt();

        if (numF > numS && numF > numT) {
            System.out.println("Max: " + numF);
        } else if (numS > numF && numS > numT) {
            System.out.println("Max: " + numS);
        } else {
            System.out.println("Max" + numT);
        }
    }
}
