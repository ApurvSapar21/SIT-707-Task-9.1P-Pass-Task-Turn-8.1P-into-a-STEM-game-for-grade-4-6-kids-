package web.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestMathQuestionService {
	
    @Test
    public void testQ1AdditionWithValidInputZeroResult() {
        assertEquals(Double.valueOf(0), MathQuestionService.q1Addition("0", "0"));
    }

    @Test
    public void testQ1AdditionWithValidInputDecimalResult() {
        assertEquals(Double.valueOf(2.5), MathQuestionService.q1Addition("1.5", "1"));
    }

    @Test
    public void testQ1AdditionWithValidInputLargeNumbers() {
        assertEquals(Double.valueOf(2000000000), MathQuestionService.q1Addition("1000000000", "1000000000"));
    }


    @Test
    public void testQ1AdditionWithInvalidInputNonNumeric() {
        assertNull(MathQuestionService.q1Addition("abc", "2"));
    }

    @Test
    public void testQ2SubtractionWithValidInputZeroResult() {
        assertEquals(Double.valueOf(0), MathQuestionService.q2Subtraction("2", "2"));
    }

    @Test
    public void testQ2SubtractionWithValidInputDecimalResult() {
        assertEquals(Double.valueOf(0.5), MathQuestionService.q2Subtraction("2.5", "2"));
    }

    @Test
    public void testQ2SubtractionWithValidInputLargeNumbers() {
        assertEquals(Double.valueOf(999999999), MathQuestionService.q2Subtraction("1000000000", "1"));
    }


    @Test
    public void testQ2SubtractionWithInvalidInputNonNumeric() {
        assertNull(MathQuestionService.q2Subtraction("abc", "2"));
    }

    @Test
    public void testQ3MultiplicationWithValidInputZeroResult() {
        assertEquals(Double.valueOf(0), MathQuestionService.q3Multiplication("0", "999"));
    }

    @Test
    public void testQ3MultiplicationWithValidInputLargeNumbers() {
        assertEquals(Double.valueOf(999000), MathQuestionService.q3Multiplication("999", "1000"));
    }


    @Test
    public void testQ3MultiplicationWithInvalidInputNonNumeric() {
        assertNull(MathQuestionService.q3Multiplication("abc", "2"));
    }
}
