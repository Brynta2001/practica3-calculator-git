package ec.edu.epn.git.calculator;

public class Calculator {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if(num2 != 0){
            return num1 / num2;
        }else{
            System.out.println("No existe división para cero.");
            if(num1 < 0){
                return Double.NEGATIVE_INFINITY;
            }else{
                return Double.POSITIVE_INFINITY;
            }
        }
    }
}
