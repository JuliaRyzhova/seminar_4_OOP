// ������ ����� "BadCalculator" � ���������� �������� ���������
public class BadCalculator {
    public double add(double a, double b) {
        // ������ �������� �����
    }

    public double subtract(double a, double b) {
        // ������ ��������� �����
    }

    public double multiply(double a, double b) {
        // ������ ��������� �����
    }

    public double divide(double a, double b) {
        // ������ ������� �����
    }

    public void start() {
        double num1 = getUserInput("Enter the first number: ");
        double num2 = getUserInput("Enter the second number: ");
        char operator = getOperator();

        double result = performOperation(num1, num2, operator);

        displayResult(result);
    }

    private double getUserInput(String message) {
        // ������ ��� ��������� ��������� ����� �� ������������
    }

    private char getOperator() {
        // ������ ��� ��������� ��������� �� ������������
    }

    private double performOperation(double num1, double num2, char operator) {
        // ������ ��� ���������� ��������
    }

    private void displayResult(double result) {
        // ������ ��� ����������� ���������� ������������
    }
}