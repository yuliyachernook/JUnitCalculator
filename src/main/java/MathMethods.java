public class MathMethods {
    public double sumOfTwoValues(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public double differenceBetweenTwoValues(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    public double  multiplyTwoValues(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public double  divisionOfTwoValues(double firstValue, double secondValue) {
        if (secondValue == 0)
            throw new IllegalArgumentException("Can't be divided by zero");
        return firstValue / secondValue;
    }

    public double  moduloOfTwoValues(double firstValue, double secondValue) {
        return firstValue % secondValue;
    }

    public double  squaringValue(double firstValue) {
        return Math.pow(firstValue, 2);
    }

    public double  sinOfValue(double firstValue) {
        return Math.sin(firstValue);
    }

    public double  cosOfValue(double firstValue) {
        return Math.cos(firstValue);
    }

    public double tanOfValue(double firstValue) {
        return Math.tan(firstValue);
    }
}