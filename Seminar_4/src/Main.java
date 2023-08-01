import org.jmlspecs.annotation.*;
//
//public class Calculator {
//    /**
//     * ��������� ������� ���� �����.
//     *
//     * @param dividend ������� (�����, ������� �����)
//     * @param divisor  �������� (�����, �� ������� �����)
//     * @return ��������� ������� � ���� ���������� ����� ���� double
//     * @throws ArithmeticException ���� �������� ����� ����
//     */
//    @Requires("divisor != 0")
//    public double divide(@NonNull double dividend, double divisor) throws ArithmeticException {
//        if (divisor == 0) {
//            throw new ArithmeticException("Cannot divide by zero.");
//        }
//        return dividend / divisor;
//    }
//}
import jcoco.*;

public class Example {
    /**
     * ������ ������ � ����������.
     *
     * @param value �������� ������
     * @return ��������� ������
     * @throws NullPointerException ���� �������� value ����� null
     */
    @NotNull
    public String exampleMethod(@NotNull String value) throws NullPointerException {
        return value.toUpperCase();
    }
}