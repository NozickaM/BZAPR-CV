package cv7_2;

import javax.xml.validation.Validator;

public class Cv2 {
    // Implementujte třídu ValidatorTextu, v této třídě vytvořte jeji instanci, zavolejte metodu validuj a zavolejte metodu toString()
    // Vytvořte minimálně validator pro jméno, příjmení (tzn. zkontrolovat, zda řetězec obsahuje  2 slova začínající velkým písmenem)
    // Zkuste experimentovat
    // Trida ValidatorTextu bude obsahovat:

    // atributy
    // String vzor (regex pattern)

    // konstruktor
    // bude přijímat jako parametr vzor a ukladat si ho jako atribut

    // funkce
    //boolean validuj(String hodnota) - pomocí hodnoty uložené v atributu vzor, bude validovan parametr hodnota (použí metodu matches)
    //String toString() - Vypíše informace o ValidatorTextu - vzor

    public static void main(String[] args) {
        ValidatorTextu check = new ValidatorTextu("[A-Z][a-z]+\\s[A-Z][a-z]+");
        System.out.println(check.toString() + "\n" + check.validuj("Miroslav Nozicka"));
    }
}
