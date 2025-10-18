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
    }
}