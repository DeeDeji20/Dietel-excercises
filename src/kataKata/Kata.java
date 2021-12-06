package kataKata;

public class Kata {
    public char calculateGradeFor(int score) {
        if(score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }


    public int calculatePriceFor(int qty, int pricePerQty) {
        if (qty > 1 && qty <= 4) return qty*pricePerQty;
        if (qty >= 5 && qty <= 9) return qty*pricePerQty;
        if (qty >= 10 && qty <= 29) return qty*pricePerQty;
        if (qty >= 30 && qty <= 49) return qty*pricePerQty;
        if (qty >= 50 && qty <= 99) return qty*pricePerQty;
        if (qty >= 100 && qty <= 199) return qty*pricePerQty;
        if (qty >= 200 && qty <= 499) return qty*pricePerQty;
        if (qty >= 500) return qty*pricePerQty;
        return 0;
    }
}
