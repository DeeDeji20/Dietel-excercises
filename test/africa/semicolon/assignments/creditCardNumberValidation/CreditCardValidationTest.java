package africa.semicolon.assignments.creditCardNumberValidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation creditCard;
    private static String doubleEvenDigit;
    private static String doubleOddDigit;
    @BeforeEach
    void setUp(){
        creditCard = new CreditCardValidation("4388576018402626");
    }
    @Test
    void test_that_class_is_not_null(){
        assertNotNull(creditCard);
    }

    @Test
    void test_that_card_has_digits(){
        String number = creditCard.getNumber();
        assertEquals("4388576018402626", number);
    }

//    @Test
//    void test_that_number_is_greater_or_equal_to_13(){
////        creditCard.setNumber("438857601840");
//        try {
//            CreditCardValidation creditCard = new CreditCardValidation("438857601840");
////            creditCard.setNumber("438857601840");
//        }catch (IllegalArgumentException e){
//            assertEquals(IllegalArgumentException.class, e.getClass());
//        }
//    }

//    @Test
//    void test_that_number_is_less_than_or_equal_to_16(){
////        creditCard.setNumber("438857601840");
//        try {
//            CreditCardValidation creditCard = new CreditCardValidation("43885760184055555");
////            creditCard.setNumber("438857601840");
//        }catch (IllegalArgumentException e){
//            assertEquals(IllegalArgumentException.class, e.getClass());
//        }
//    }

    @Test
    void test_that_creditcard_number_has_digits_greater_than_13_and_less_than_16(){
        CreditCardValidation.isValidNumberLength(creditCard.getNumber());
        assertTrue(creditCard.getNumber().length()>=13 && creditCard.getNumber().length()<=16);
    }
    @Test
    void test_that_creditCardNumber_starts_with_4_5_37_or_6(){
//        String crardNumber  = "1657890453213457";
        assertTrue(CreditCardValidation.isValidFirstNumber(creditCard.getNumber()));
    }


    @Test
    void test_double_even_places(){
        assertEquals("44823178",CreditCardValidation.doubleEvenPlace(creditCard.getNumber()));
    }

    @Test
    void test_add_all_single_digit_from_the_double_even_placed_digit(){
        doubleEvenDigit = CreditCardValidation.doubleEvenPlace(creditCard.getNumber());
        assertEquals(37, CreditCardValidation.sumOfDoubleEvenPlace(doubleEvenDigit));
    }

    @Test
    void test_double_odd_places() {
        assertEquals("33070576", CreditCardValidation.doubleOddPlace(creditCard.getNumber()));
    }

    @Test
    void test_add_all_single_digit_from_the_double_odd_placed_digit(){
        doubleOddDigit = CreditCardValidation.doubleOddPlace(creditCard.getNumber());
        assertEquals(31, CreditCardValidation.sumOfDoubleOddPlace(doubleOddDigit));
    }

    @Test
    void test_to_get_the_sum_of_odd_and_even_places (){
        doubleOddDigit = CreditCardValidation.doubleOddPlace(creditCard.getNumber());
        doubleEvenDigit = CreditCardValidation.doubleEvenPlace(creditCard.getNumber());
        assertEquals(68, CreditCardValidation.getSumOfEvenAndOddDigit());
    }
}