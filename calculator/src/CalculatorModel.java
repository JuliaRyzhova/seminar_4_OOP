// ������
public class CalculatorModel {
    private double result;
    public void add(double num1, double num2) {
        result = num1 + num2;
    }
    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }
    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }
    /**
     * ��������� ������� ���� �����.
     *
     * @param num1 ������� (�����, ������� �����)
     * @param num2  �������� (�����, �� ������� �����)
     * @return ��������� ������� � ���� ���������� ����� ���� double
     * @throws ArithmeticException ���� �������� ����� ����
     */
    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
    public double getResult() {
        return result;
    }
}