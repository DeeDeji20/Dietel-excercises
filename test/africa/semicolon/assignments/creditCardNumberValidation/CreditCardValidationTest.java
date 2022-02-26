package africa.semicolon.assignments.creditCardNumberValidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation creditCard;
    @BeforeEach
    void setUp(){
        creditCard = new CreditCardValidation("4388576018402626");
    }
    @Test
    void test_that_class_is_not_null(){
//        CreditCardValidation creditCard = new CreditCardValidation("4388576018402626");
        assertNotNull(creditCard);
    }

    @Test
    void test_that_card_has_digits(){
//        CreditCardValidation creditCard = new CreditCardValidation("4388576018402626");
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
    public void test_that_when_every_second_digit_from_right_can_be_added(){
        //given that i have  a credit card number
//        CreditCardValidation creditCard = new CreditCardValidation("3788576018402626");
        String number = creditCard.getNumber();

        //when i try to get the second number from right to left
        for (int i = number.length()-1; i >=0; i--){
            if (i%2 == 0) System.out.println(number.charAt(i));
//            assertEquals(2, number.charAt(number.length()-1));
        }
//        assertEquals(2, creditCard.doubleSecondDigits());
    }

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

//    @Test
//    void test_that_number_is_valid(){
//
//    }


    @Test
    void test_double_even_places(){
        assertEquals("22823178",CreditCardValidation.doubleEvenPlace(creditCard.getNumber()));
    }
}