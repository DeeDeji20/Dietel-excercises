package africa.semicolon.assignments.creditCardNumberValidation;

public class CreditCardValidation {
    private String number ;

    public CreditCardValidation(String number) {
        if (number.length() < 13) throw new IllegalArgumentException("Invalid");
        try {
            this.number = number;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
