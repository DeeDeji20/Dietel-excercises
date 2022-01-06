package africa.semicolon.chapterSix.primeNumbers;

public class PrimeNumber {
    public boolean isPrime(int number) {
        for (int factor = 1; factor <= number; factor++) {
            if (number % factor ==0 && number !=factor){
                return false;
            }
        }
        return true;
    }
}
