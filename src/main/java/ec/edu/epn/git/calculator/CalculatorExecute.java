package ec.edu.epn.git.calculator;


public class CalculatorExecute {
    public static void main(String [] args){
        System.out.println("Calculator Execute");
        Calculator calculator = new Calculator();
        System.out.println("Suma: \ncalculator.addition(15.2, 42.1) =" + calculator.addition(15.2, 42.1));
        System.out.println("Resta: \ncalculator.subtraction(15.2, 42.1) =" + calculator.subtraction(15.2, 42.1));
        System.out.println("Multiplicación: \ncalculator.multiplication(15.2, 0.5) =" + calculator.multiplication(15.2, 0.5));
        System.out.println("División: \ncalculator.division(15.2, 5) =" + calculator.division(15.2, 5));

        System.out.println("");
        System.out.println("Raíz Cuadrada: \ncalculator.squareRoot(134.75)" + calculator.squareRoot(134.75));
        System.out.println("Potenciación: calculator.pow(3.2, 4.25)" + calculator.pow(3.2, 4.25));

        double operation = calculator.division(calculator.pow(calculator.addition(5.2, 10.2), 2.4), calculator.multiplication(0.35, 3.79));
        System.out.println("Operación combinada: \n " +
                "calculator.division(calculator.pow(calculator.addition(5.2, 10.2), 2.4), calculator.multiplication(0.35, 3.79)) = "
                + operation);

    }

}
