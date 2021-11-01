package cv7_1;

public class Cv1 {
    // Implementujte třídu Kostka, v této třídě vytvořte jeji instanci, zavolejte metodu hodKostkou a zavolejte metodu toString()
    // Trida Kostka bude obsahovat:

    // atributy
    // int pocetSten

    // konstruktor
    // bude přijímat jako parametr pocetSten a ukladat si ho jako atribut

    // funkce
    //double hodKostkou() - bude vracet výsledek hodu kostkou (využijte random)
    //String toString() - Vypíše informace o kostkce - pocetSten

    public static void main(String[] args) {
        Kostka Die = new Kostka(24);
        for (int i = 0; i < 10; i++) {
            System.out.println(Die.hodKostkou() + "\n" + Die.toString());
        }
    }
}
