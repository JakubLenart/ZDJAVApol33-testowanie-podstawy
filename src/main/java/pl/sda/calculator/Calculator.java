package pl.sda.calculator;

public class Calculator {

    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public boolean isDividableByThree(int arg1) {
        return (arg1 % 3 == 0);

    }

    public int substract(int arg1, int arg2) {
        return (arg1 - arg2);

    }

    public int multiply(int arg1, int arg2) {
        return (arg1 * arg2);
    }

    public int division(int arg1, int arg2) {
        return (arg1 / arg2);


        //if (arg2 == 0) {
        //return 0;
        //} else {
        //    return arg1 / arg2;
    }


    public boolean ifNumberIsEven(int arg1) {
        return arg1 % 2 == 0;
    }

    public boolean ifNumberIsNotEven (int arg) {
        return arg % 2 != 0;
    }

    public double percentage(double arg1, double arg2) {
        return (arg1 * arg2) / 100.0d;
    }

}





