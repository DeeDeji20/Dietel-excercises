package africa.semicolon.chapterEight.taxClass;

public class TaxClass {
    private Status staus;
    int[][] brackets;
    double[] rates;
    double taxableIncome;

    public TaxClass(Status staus, int[][] brackets, double[] rates, double taxableIncome) {
        this.staus = staus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public Status getStaus() {
        return staus;
    }

    public void setStaus(Status staus) {
        this.staus = staus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public void getTax(){

    }
}
