package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    //Point 1
    @Test
    void string_with_two_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    //Point 3
    @Test
    void string_with_new_lines_between_numbers_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    //Point 4
    @Test
    void string_with_different_delimiters_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    //Point 5
    @Test
    void string_with_negative_number_should_exception_thrown() {
        StringCalculator stringCalculator = new StringCalculator();
        Exception exception = assertThrows(Exception.class, () -> {
            stringCalculator.add("1,-2,5,-6");
        });

        String expectedMessage = "negatives not allowed - [-2, -6]";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    //Point 6
    @Test
    void string_with_Numbers_bigger_than_1000_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2,1001"));
    }

}
