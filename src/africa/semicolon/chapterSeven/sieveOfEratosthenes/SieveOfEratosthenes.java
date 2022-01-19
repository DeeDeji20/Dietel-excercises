package africa.semicolon.chapterSeven.sieveOfEratosthenes;

public class SieveOfEratosthenes {
    private final boolean[] isPrimeNumber = new boolean[20];

    public void compute(int row){
            isPrimeNumber[row] = true;
    }
    public void displaySieveOfEratosthenes() {
        for (boolean prime : isPrimeNumber) {
            System.out.print(prime + " ");
        }
    }

    public void checkForPrimeIndex() {
        int squareRoot = 0;
        int index;
        for (index = 0; index < isPrimeNumber.length; index++) {
            squareRoot = (int)Math.pow(index, 2);
            boolean indexIsPrime = index >= 3 && (index % 2!=0 && index%3 != 0 && index % squareRoot!=0);
            if(indexIsPrime) compute(index);
        }
    }
}
