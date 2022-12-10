package ec.edu.epn.git.calculator;


public class CalculatorExecute {
    public static void main(String [] args){
        System.out.println("Calculator Execute");
        Calculator calculator = new Calculator();
        System.out.println("Suma: calculator.addition(15.2, 42.1) =" + calculator.addition(15.2, 42.1));
        System.out.println("Resta: calculator.subtraction(15.2, 42.1) =" + calculator.subtraction(15.2, 42.1));
        System.out.println("Multiplicación: calculator.multiplication(15.2, 0.5) =" + calculator.multiplication(15.2, 0.5));
        System.out.println("División: calculator.division(15.2, 5) =" + calculator.division(15.2, 5));
    }

}
