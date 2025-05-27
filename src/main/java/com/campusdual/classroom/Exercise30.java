package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException();
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int division;
        try {
            division = divisionWithCustomException(10, 0);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            division = 0;
        }
        System.out.println("El valor de la division es: " + division);
    }
}
