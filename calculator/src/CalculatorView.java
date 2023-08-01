// Представление
import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public double getFirstNumber() {
        System.out.print("Enter the first number: ");
        return scanner.nextDouble();
    }

    public double getSecondNumber() {
        System.out.print("Enter the second number: ");
        return scanner.nextDouble();
    }

    public char getOperator() {
        System.out.print("Enter the operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    /**
     * Класс, представляющий калькулятор.
     */
    public static class Calculator {

        /**
         * Выполняет деление двух чисел.
         *
         * @param dividend делимое (число, которое делим)
         * @param divisor  делитель (число, на которое делим)
         * @return результат деления в виде десятичной дроби типа double
         * @throws ArithmeticException если делитель равен нулю
         */
        public double divide(double dividend, double divisor) throws ArithmeticException {
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return dividend / divisor;
        }
    }
}