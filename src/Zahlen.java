public class Zahlen {
    public int maximum(int... zahlen) {
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
        }
        return max;
    }
    public  int minimum(int... zahlen) {
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
        }
        return min;
    }
    //max summe n-1 z.

    public int maxSumme(int... zahlen) {
        int sum = 0;
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
            sum += zahl;
        }
        return sum - min;
    }

    public int minSumme(int... zahlen) {
        int sum = 0;
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
            sum += zahl;
        }
        return sum - max;
    }
}

// }
