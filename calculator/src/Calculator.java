/**
 * �����, �������������� �����������.
 */
public class Calculator {

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