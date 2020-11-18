
public class MathMethods {

    public double sumOfTwoValues(double number1, double  number2) {
        return number1 + number2;
    }

    public double differenceBetweenTwoValues(double  number1, double  number2) {
        return number1 - number2;
    }

    public double  multiplyTwoValues(double number1, double  number2) {
        return number1 * number2;
    }

    public double  divisionOfTwoValues(double  number1, double number2) {
        if (number2 == 0)
            throw new IllegalArgumentException();
        return number1 / number2;
    }
    public double  moduloOfTwoValues(double  number1, double number2) {
        return number1 % number2;
    }

    public double  squaringValue(double  number1) {
        return Math.pow(number1, 2);
    }

    public double  sinOfValue(double  number1) {
        return Math.sin(number1);
    }

    public double  cosOfValue(double  number1) {
        return Math.cos(number1);
    }

    public double tanOfValue(double  number1) {
        return Math.tan(number1);
    }
}