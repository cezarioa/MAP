import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Noten noten = new Noten();
        int[] grades = {85, 42, 39, 78, 90, 33, 67, 88, 40};

        System.out.println("Nicht Ausreichend: " + noten.nichtAusreichend(grades));
        System.out.println("Durchschnitt: " + noten.durchschnitt(grades));
        System.out.println("Abgerundete Noten: " + noten.abgerundeteNoten(grades));
        System.out.println("Beste Abgerundete Note: " + noten.besteAbgNote(grades));

        Zahlen zahlen = new Zahlen();
        int[] nr = {3, 5, 1, 8, 2};
        System.out.println("Maximum: " + zahlen.maximum(nr));
        System.out.println("Minimum: " + zahlen.minimum(nr));
        System.out.println("Maximale Summe (n-1): " + zahlen.maxSumme(nr));
        System.out.println("Minimale Summe (n-1): " + zahlen.minSumme(nr));

        Operationen operationen = new Operationen();
        int[] num1 = {3, 5, 6};
        int[] num2 = {4, 0, 0};
        System.out.println("Summe: " + Arrays.toString(operationen.Summe(num1, num2)));
        System.out.println("Differenz: " + Arrays.toString(operationen.Differenz(num1, num2)));
        System.out.println("Produkt: " + Arrays.toString(operationen.Produkt(num2, 2)));
        System.out.println("Division: " + Arrays.toString(operationen.Division(num2, 2)));

        ElektronikShop shop = new ElektronikShop();

        int[] tastaturen = {40, 50, 60};
        int[] usb = {8, 12};
        int budget = 60;

        System.out.println("Billigste Tastatur: " + ElektronikShop.billigsteTastatur(tastaturen));
        System.out.println("Teuerster Gegenstand: " + ElektronikShop.teuersterGegenstand(tastaturen, usb));
        System.out.println("Teuerstes USB (Budget 30): " + ElektronikShop.teuerstesUSB(new int[]{15, 45, 20}, 30));
        System.out.println("Maximaler Kaufbetrag (Budget 60): " + ElektronikShop.maximalerKaufbetrag(tastaturen, usb, budget));

    }
}