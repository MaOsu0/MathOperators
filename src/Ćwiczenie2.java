public class Ćwiczenie2 {
    public static void main(String[] args) {

        double cenaNetto = 50;
        double vat = 0.23;

        System.out.println("Cena netto wynosi: " + cenaNetto + "zł");
        System.out.println("Wysokość podatki Vat wynosi: " + vat*100 + "%");
        System.out.println("Kwota brutto wynosi: "+ (vat*cenaNetto + cenaNetto) + "zł");

    }
}
