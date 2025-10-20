public class ElektronikShop {

    public static int billigsteTastatur(int[] tastaturen) {
        int min = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis < min) {
                min = preis;
            }
        }
        return min;
    }
    public static int teuersterGegenstand(int[] tastaturen, int[] usb) {
        int max = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis > max) {
                max = preis;
            }
        }
        for (int preis : usb) {
            if (preis > max) {
                max = preis;
            }
        }
        return max;
    }

    public static int teuerstesUSB(int[] usb, int budget) {
        int max = -1;
        for (int preis : usb) {
            if (preis <= budget && preis > max) {
                max = preis;
            }
        }
        return max;
    }

    public static int maximalerKaufbetrag(int[] tastaturen, int[] usb, int budget) {
        int maxSumme = -1;
        for (int t : tastaturen) {
            for (int u : usb) {
                int summe = t + u;
                if (summe <= budget && summe > maxSumme) {
                    maxSumme = summe;
                }
            }
        }
        return maxSumme;
    }
}
