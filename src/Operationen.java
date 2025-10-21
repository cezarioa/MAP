import java.util.Arrays;

public class Operationen {
    public int[] Summe(int[] nr1, int[] nr2) {
        int[] result = new int[nr1.length];

        for (int i = nr1.length - 1; i >= 0; i--) {
            int tempSum = nr1[i] + nr2[i];
            if (tempSum >= 10) {
                result[i] = tempSum % 10;
                if (i > 0) {
                    nr1[i - 1] = nr1[i - 1] + 1;
                }
            } else {
                result[i] = tempSum;
            }
        }

        return result;
    }

    public int[] Differenz(int[] nr1, int[] nr2) {
        int[] result = new int[nr1.length];

        for (int i = nr1.length - 1; i >= 0; i--) {
            int tempDiff = nr1[i] - nr2[i];
            if (tempDiff < 0) {
                result[i] = tempDiff + 10;
                if (i > 0) {
                    nr1[i - 1] = nr1[i - 1] - 1;
                }
            } else {
                result[i] = tempDiff;
            }
        }

        return result;
    }

    public int[] Produkt(int[] nr1, int nr2) {
        int[] result = new int[nr1.length];

        int carry = 0;
        for (int i = nr1.length - 1; i >= 0; i--) {
            int tempProd = nr1[i] * nr2 + carry;
            result[i] = tempProd % 10;
            carry = tempProd / 10;
        }

        return result;
    }

    public int[] Division(int[] nr1, int nr2) {
        int[] result = new int[nr1.length];

        int remainder = 0;
        for (int i = 0; i < nr1.length; i++) {
            int tempQuotient = remainder * 10 + nr1[i];
            result[i] = tempQuotient / nr2;
            remainder = tempQuotient % nr2;
        }

        return result;
    }
}