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

        int ct=0;
        for (int i = nr1.size()-1; i >=0; i--) {
            int tempDiff = nr1.get(i) - nr2.get(i);
            if(tempDiff < 0) {
                result.add(ct, tempDiff + 10);
                nr1.set(i-1, nr1.get(i-1) - 1);
            }
            else {
                result.add(ct, tempDiff);
            }
            ct++;

        }
        Collections.reverse(result);
        return result;
    }

    public ArrayList<Integer> Produkt(ArrayList<Integer> nr1, int nr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int counter = 0;
        boolean carry = false;
        for (int i = nr1.size()-1; i >=0; i--){

            int tempProd = nr1.get(i) * nr2;
            if (carry) {
                tempProd++;
                carry = false;
            }
            if(tempProd >= 10) {
                carry = true;
                result.add(counter, tempProd % 10);

            }
            else {
                result.add(counter, tempProd);
            }
            counter++;

        }
        Collections.reverse(result);
        return result;
    }
    public ArrayList<Integer> Division(ArrayList<Integer> nr1, int nr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int remainder = 0;
        for (int i = 0; i < nr1.size(); i++) {
            int tempQuotient = remainder * 10 + nr1.get(i);
            result.add(tempQuotient / nr2);
            remainder = tempQuotient % nr2;
        }
        return result;
    }
}
