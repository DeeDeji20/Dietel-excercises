package africa.semicolon.assignments.creditCardNumberValidation;

public class CreditCardValidation {
    private String number ;

    public CreditCardValidation(String number) {
        if (isValidNumberLength(number) && isValidFirstNumber(number)) this.number = number;

    }

    public static boolean isValidFirstNumber(String number) {
        return number.startsWith("4") || number.startsWith("5")
                || number.startsWith("37") || number.startsWith("6");
    }

    public static boolean isValidNumberLength(String number) {
        return number.length() >= 13 && number.length() <= 16;
    }

    public static String doubleEvenPlace(String number) {
        int doubleEvenDigit = 0;
        StringBuilder stringOfDoubleEvenDigits = new StringBuilder();
        for (int i = number.length()-1; i >=0; i--){
            if (number.length() % 2 == 0 && i % 2 == 0) {
                doubleEvenDigit = Character.getNumericValue(number.charAt(i) * 2) ;
            }
            if (number.length() % 2 != 0 && i % 2 != 0){
                doubleEvenDigit = Character.getNumericValue(number.charAt(i) * 2) ;
            }
            stringOfDoubleEvenDigits.append(doubleEvenDigit);
        }
        return stringOfDoubleEvenDigits.toString();
    }

    private static boolean validatDoubleOfEvenDigits(int doubleEvenDigit){
        return doubleEvenDigit < 10;
    }

    public String getNumber() {
        return number;
    }

//    public void setNumber(String number) {
//        if (number.length() < 13) throw new IllegalArgumentException("Invalid");
//        this.number = number;
//    }
}
