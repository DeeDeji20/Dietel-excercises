package africa.semicolon.chapterSeven.sieveOfEratosthenes;

public class SieveOfEratosthenes {
    private final boolean[] isPrimeNumber = new boolean[5];

    public void displaySieveOfEratosthenes() {
        for (boolean prime : isPrimeNumber) {
//            prime = true;
            System.out.print(prime + " ");
        }
    }

    public void checkForPrimeIndex() {
        for (int row = 0; row < isPrimeNumber.length; row++) {
//            if (row)
        }
    }
}
