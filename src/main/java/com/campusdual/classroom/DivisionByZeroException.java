package com.campusdual.classroom;

public class DivisionByZeroException extends ArithmeticException {
    @Override
    public String getMessage(){
        return "Error: El divisor es cero. No se puede dividir entre cero.";
    }
}
