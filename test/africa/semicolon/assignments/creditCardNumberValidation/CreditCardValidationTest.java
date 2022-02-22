package africa.semicolon.assignments.creditCardNumberValidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation creditCard;
    @BeforeEach
    void setUp(){
        creditCard = new CreditCardValidation("438857601840");
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

    @Test
    void test_that_number_is_greater_or_equal_to_13(){
//        creditCard.setNumber("438857601840");
        assertEquals(13, creditCard.getNumber().length());
        assertThrows(IllegalArgumentException.class, ()->  creditCard.setNumber("438857601840"));
    }
}