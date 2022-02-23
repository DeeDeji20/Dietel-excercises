package africa.semicolon.assignments.creditCardNumberValidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation creditCard;
//    @BeforeEach
//    void setUp(){
//        creditCard = new CreditCardValidation("4388576018402626");
//    }
    @Test
    void test_that_class_is_not_null(){
        CreditCardValidation creditCard = new CreditCardValidation("4388576018402626");
        assertNotNull(creditCard);
    }

    @Test
    void test_that_card_has_digits(){
        CreditCardValidation creditCard = new CreditCardValidation("4388576018402626");
        String number = creditCard.getNumber();
        assertEquals("4388576018402626", number);
    }

    @Test
    void test_that_number_is_greater_or_equal_to_13(){
//        creditCard.setNumber("438857601840");
        try {
            CreditCardValidation creditCard = new CreditCardValidation("438857601840");
//            creditCard.setNumber("438857601840");
        }catch (IllegalArgumentException e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    void test_that_number_is_less_than_or_equal_to_16(){
//        creditCard.setNumber("438857601840");
        try {
            CreditCardValidation creditCard = new CreditCardValidation("43885760184055555");
//            creditCard.setNumber("438857601840");
        }catch (IllegalArgumentException e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void test_that_when_every_second_digit_from_right_can_be_added(){
        //given that i have  a credit card number
        CreditCardValidation creditCard = new CreditCardValidation("4388576018402626");
        String number = creditCard.getNumber();

        //when i try to get the second number from right to left
    }
}