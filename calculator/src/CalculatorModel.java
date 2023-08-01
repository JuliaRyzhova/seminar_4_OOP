// Модель
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
     * Выполняет деление двух чисел.
     *
     * @param num1 делимое (число, которое делим)
     * @param num2  делитель (число, на которое делим)
     * @return результат деления в виде десятичной дроби типа double
     * @throws ArithmeticException если делитель равен нулю
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