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
                doubleEvenDigit = getDoubleEvenDigit(number, stringOfDoubleEvenDigits, i);
                stringOfDoubleEvenDigits.append(doubleEvenDigit);
            }
            if (number.length() % 2 != 0 && i % 2 != 0){
                doubleEvenDigit = getDoubleEvenDigit(number, stringOfDoubleEvenDigits, i);
                stringOfDoubleEvenDigits.append(doubleEvenDigit);
            }
        }
        return stringOfDoubleEvenDigits.toString();
    }

    private static int getDoubleEvenDigit(String number, StringBuilder stringOfDoubleEvenDigits, int i) {
        int doubleEvenDigit = 0;
        doubleEvenDigit = Character.getNumericValue(number.charAt(i)) * 2 ;
        if (isValidDoubleOfEvenDigit(doubleEvenDigit)) return doubleEvenDigit;
        else {
            String str = String.valueOf(doubleEvenDigit);
            doubleEvenDigit = Character.getNumericValue(str.charAt(0)) +
                    Character.getNumericValue(str.charAt(1));
                return doubleEvenDigit;
        }
    }

    private static boolean isValidDoubleOfEvenDigit(int doubleEvenDigit){
        return doubleEvenDigit < 10;
    }

    public static int sumOfDoubleEvenPlace(String doubleEvenDigit) {
        int sum = 0;
        for (int i = 0; i < doubleEvenDigit.length(); i++) {
            sum += Character.getNumericValue(doubleEvenDigit.charAt(i));
        }
        return sum;
    }

    public static String doubleOddPlace(String number) {
        StringBuilder stringOfDoubleEvenDigits = new StringBuilder();
        for (int i = number.length()-1; i >= 0; i--) {
            //if the number is an even number
            int doubleOddNumber;
            if (number.length() % 2 == 0 && i % 2 != 0){
                doubleOddNumber = getDoubleOddPlace(number, i);
                stringOfDoubleEvenDigits.append(doubleOddNumber);
            }
            else if (number.length() % 2 != 0 && i % 2 != 0){
                doubleOddNumber = getDoubleOddPlace(number, i);
                stringOfDoubleEvenDigits.append(doubleOddNumber);
            }
        }
            return stringOfDoubleEvenDigits.toString();
    }

    private static int getDoubleOddPlace(String number, int i) {
        int doubleOddPlace = Character.getNumericValue(number.charAt(i)) * 2;

        if(isValidDoubleOfOddDigit(doubleOddPlace)) return doubleOddPlace;
        else{
            String str = String.valueOf(doubleOddPlace);
            doubleOddPlace = Character.getNumericValue(str.charAt(0)) + Character.getNumericValue(str.charAt(1));
            return doubleOddPlace;
        }
    }

    private static boolean isValidDoubleOfOddDigit(int number) {
        return number < 10;
    }

    public static int sumOfDoubleOddPlace(String doubleOddPlace) {
        int sum = 0;
        for (int i = 0; i < doubleOddPlace.length(); i++) {
            sum += Character.getNumericValue(doubleOddPlace.charAt(i));
        }
        return sum;
    }

    public String getNumber() {
        return number;
    }

//    public void setNumber(String number) {
//        if (number.length() < 13) throw new IllegalArgumentException("Invalid");
//        this.number = number;
//    }
}
