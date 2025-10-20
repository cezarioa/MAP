import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Operationen {
    public ArrayList<Integer> Summe(ArrayList<Integer> nr1, ArrayList<Integer> nr2) {
        ArrayList<Integer> result = new ArrayList<>();


        int ctr = 0;
        for (int i = nr1.size()-1; i >=0; i--) {

            int tempSum = nr1.get(i) + nr2.get(i);
            if(tempSum >= 10) {
                result.add(ctr, tempSum % 10);
                nr1.set(i-1, nr1.get(i-1) + 1);
            }
            else {
                result.add(ctr, tempSum);
            }
            ctr++;

        }
        Collections.reverse(result);
        return result;
    }

    public ArrayList<Integer> Differenz(ArrayList<Integer> nr1, ArrayList<Integer> nr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = nr1.size()-1; i >=0; i--) {
            int tempDiff = nr1.get(i) - nr2.get(i);
            if(tempDiff < 0) {
                result.add(i, tempDiff + 10);
                nr1.set(i-1, nr1.get(i-1) - 1);
            }
            else {
                result.add(i, tempDiff);
            }

        }
        return result;
    }

    public ArrayList<Integer> Produkt(ArrayList<Integer> nr1, int nr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = nr1.size()-1; i >=0; i--){
            int tempProd = nr1.get(i) * nr2;
            if(tempProd >= 10) {
                result.add(i, tempProd % 10);
                nr1.set(i-1, nr1.get(i-1) + 1);
            }
            else {
                result.add(i, tempProd);
            }

        }
        return result;
    }
}
