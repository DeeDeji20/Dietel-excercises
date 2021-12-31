package africa.semicolon.exceptionHandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeUsageTest {
    @Test
    void testReturnsGradeAWhenScoreIsBetween90And100() throws InvalidGradeException {
        //given
        GradeUsage calc = new GradeUsage();
        //when
        String grade = calc.returnGrade(90);
        //assert
        assertEquals("A", grade);
    }
    @Test
    void testThrowsExceptionWhenAnInvalidScoreIsInput() throws InvalidGradeException {
        GradeUsage calc = new GradeUsage();
//        Exception exception =
        assertThrows(InvalidGradeException.class, () -> calc.returnGrade(-10));
//        assertEquals("InvalidGradeException", exception.getClass().getSimpleName());
    }
}