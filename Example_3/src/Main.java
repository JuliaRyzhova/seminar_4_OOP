//  ласс, представл€ющий калькул€тор
public class Calculator {
    private Addition adder;
    private Subtraction subtractor;
    private Multiplication multiplier;
    private Division divider;

    public Calculator() {
        adder = new Addition();
        subtractor = new Subtraction();
        multiplier = new Multiplication();
        divider = new Division();
    }

    public double add(double a, double b) {
        return adder.add(a, b);
    }

    public double subtract(double a, double b) {
        return subtractor.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return multiplier.multiply(a, b);
    }

    public double divide(double a, double b) {
        return divider.divide(a, b);
    }
}

//  ласс, представл€ющий сложение
public class Addition {
    public double add(double a, double b) {
        return a + b;
    }
}

//  ласс, представл€ющий вычитание
public class Subtraction {
    public double subtract(double a, double b) {
        return a - b;
    }
}

//  ласс, представл€ющий умножение
public class Multiplication {
    public double multiply(double a, double b) {
        return a * b;
    }
}

//  ласс, представл€ющий деление
public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}