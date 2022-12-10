package ec.edu.epn.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    double base;
    double exponent;
    double expected;
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{9.5, 3.0, 857.37});
        objects.add(new Object[]{25.0, 0.5, 5.0});
        objects.add(new Object[]{7.7, 2.0, 59.29});
        objects.add(new Object[]{2.1, 3.0, 9.26});
        objects.add(new Object[]{150.0, -0.2, 0.37});
        return objects;
    }

    public CalculatorParametersTest(double base, double exponent, double expected) {
        this.base = base;
        this.exponent = exponent;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_pow_then_ok(){
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.pow(base, exponent), 0.01);
    }
}