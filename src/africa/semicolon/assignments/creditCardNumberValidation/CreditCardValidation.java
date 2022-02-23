package africa.semicolon.assignments.creditCardNumberValidation;

public class CreditCardValidation {
    private String number ;

    public CreditCardValidation(String number) {
        if (number.length() < 13 || number.length() > 16) throw new IllegalArgumentException("Invalid");
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

//    public void setNumber(String number) {
//        if (number.length() < 13) throw new IllegalArgumentException("Invalid");
//        this.number = number;
//    }
}
