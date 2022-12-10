package ec.edu.epn.git.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp(){
        calculator = new Calculator();
    }
    @Test
    public void given_two_numbers_when_addition_then_ok(){
        assertEquals(20.57,calculator.addition(11.23,9.34), 0.00);
    }

    @Test
    public void given_two_numbers_when_subtraction_then_ok(){
        assertEquals(28.22,calculator.subtraction(11.35,-16.87), 0.00);
    }

    @Test
    public void given_two_numbers_when_multiplication_then_ok(){
        assertEquals(118.76,calculator.multiplication(8.65,13.73), 0.01);
    }

    @Test
    public void given_two_numbers_when_division_then_ok(){
        assertEquals(Double.POSITIVE_INFINITY,calculator.division(5.2,0), 0.01);
    }

    @Test
    public void given_a_number_when_square_root_then_ok(){
        assertEquals(2.0,calculator.squareRoot(4.0), 0.01);
    }

    @Test
    public void given_two_numbers_when_pow_then_ok(){
        assertEquals(35.94,calculator.pow(3.3, 3.0), 0.01);
    }
}