// �������������
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
     * �����, �������������� �����������.
     */
    public static class Calculator {

        /**
         * ��������� ������� ���� �����.
         *
         * @param dividend ������� (�����, ������� �����)
         * @param divisor  �������� (�����, �� ������� �����)
         * @return ��������� ������� � ���� ���������� ����� ���� double
         * @throws ArithmeticException ���� �������� ����� ����
         */
        public double divide(double dividend, double divisor) throws ArithmeticException {
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return dividend / divisor;
        }
    }
}