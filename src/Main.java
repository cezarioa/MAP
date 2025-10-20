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
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(4);
        num1.add(5);
        num1.add(6);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(3);
        num2.add(0);
        num2.add(0);
        System.out.println("Summe: " + operationen.Summe(num1, num2));
        System.out.println("Differenz: " + operationen.Differenz(num1, num2));
        System.out.println("Produkt: " + operationen.Produkt(num1, 3));

    }
}