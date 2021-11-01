package cv7_1;

public class Kostka {
    private int pocetSten;

    public Kostka(int pocetSten) {
        this.pocetSten = pocetSten;
    }

    public int hodKostkou() {
        return (int) (Math.random() * this.pocetSten) + 1;
    }

    @Override
    public String toString() {
        return "Kostka: " +
                "pocetSten: " + this.pocetSten;
    }
}
