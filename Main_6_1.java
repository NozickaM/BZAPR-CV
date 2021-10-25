package com.company;

public class Main {
    public static class Kruh {
        double polomer;

        public Kruh(double polomer) {
            this.polomer = polomer;
        }

        public double dejObvod() {
            return 2 * polomer * Math.PI;
        }

        public double dejObsah() {
            return Math.PI * Math.pow(polomer, 2);
        }

        @Override
        public String toString() {
            return "polomer: " + polomer + " obsah: " + dejObsah() + " obvod: " + dejObvod();
        }
    }

    // Implementujte třídu Kruh, v této třídě vytvořte jeho instanci a zavolejte metodu toString()
    // Trida Kruh bude obsahovat:

    // atributy
    // double polomer

    // konstruktor
    // bude přijímat jako parametr polomer a ukladat si ho jako atribut

    // funkce
    //double dejObvod() - bude vracet obvod kruhu
    //double dejObsah() - bude vracet obsah kruhu
    //String toString() - Vypíše informace o kruhu - jeho polomer, obvod a obsah
    public static void main(String[] args) {
        Kruh circle = new Kruh(6);
        System.out.println(circle.toString());

    }
}
