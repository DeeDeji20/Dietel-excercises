package africa.semicolon.mathClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathClassTest {
    @Test
    void implementMathSquareRootMethod(){
        //given
        MathClass myMathClass = new MathClass();
        //when
        myMathClass.sqrt(49);
        int sqrt =myMathClass.getSquareRoot();
        //assert
        assertEquals(7, sqrt);
    }

    @Test
    void implementMathMaxMethod(){
        //given
        MathClass myMathClass = new MathClass();
        //when
        myMathClass.max(-1,-2);
        int max =myMathClass.getMaximum();
        //assert
        assertEquals(-1, max);
    }
    @Test
    void implementMathMaxMethodForDouble(){
        //given
        MathClass myMathClass = new MathClass();
        //when
        myMathClass.max(2.0,1.0);
        double max =myMathClass.getDoubleMaximum();
        //assert
        assertEquals(2.0, max);
    }
    @Test
    void implementMathCeilMethod(){
        //given
        MathClass mymathClass = new MathClass();
        //when
        mymathClass.ceilImplementation(5.2);
        //assert
        assertEquals(6.0, mymathClass.getCeilValue());
    }

    @Test
    void implementMathFloorMethod() {
        //given
        MathClass mymathClass = new MathClass();
        //when
        mymathClass.floorImplementation(2.9);
        //assert
        assertEquals(2.0, mymathClass.getFloorImplementation());
    }
}
