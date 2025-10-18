import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Noten {

    public List<Integer> nichtAusreichend(int[] noten) {
        List<Integer> nr = new ArrayList<>();
        for (int note : noten) {
            if (note < 40) {
                nr.add(note);
            }
        }
        return nr;
    }

    public double durchschnitt(int[] noten) {
        double sum = 0;
        for (int note : noten) {
            sum += note;
        }
        return sum / noten.length;
    }

    public List<Integer> abgerundeteNoten(int[] noten) {
        List<Integer> gerundet = new ArrayList<>();
        for (int note : noten) {
            if (note >= 38) {
                int nextMult = ((note / 5) + 1) * 5;
                if (nextMult - note < 3) {
                    gerundet.add(nextMult);
                } else {
                    gerundet.add(note);
                }
            } else {
                gerundet.add(note);
            }
        }
        return gerundet;
    }

    public int besteAbgNote(int[] noten) {
        List<Integer> abgNoten = abgerundeteNoten(noten);
        int max = abgNoten.get(0);
        for (int note : abgNoten) {
            if (note > max) {
                max = note;
            }
        }
        return max;
    }
}
