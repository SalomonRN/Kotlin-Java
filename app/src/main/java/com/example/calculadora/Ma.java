package com.example.calculadora;

public class Ma {


    public double funcionSuma(double valor1, double valor2) {

        return valor1 + valor2;
    }

    public double funcionResta(double valor1, double valor2) {

        return valor1 - valor2;
    }

    public double funcionMultiplicacion(double valor1, double valor2) {

        return valor1 * valor2;
    }

    public double funcionDivision(double valor1, double valor2) {

        if (valor2 != 0) {
            return valor1 / valor2;
        } else {

            return Double.NaN;
        }
    }

    public double funcionPotencia(double valor1, double valor2) {

        double msj;

        if (valor2 == 0) {
            msj = 1;
        } else {
            msj = valor1 * funcionPotencia(valor1, valor2 - 1);
        }
        return msj;


    }

    public double funcionFactorial(double valor1){

        double msj;

        if (valor1 == 0){
            return 1;

        } else {
            msj = valor1 * funcionFactorial(valor1 - 1);

        }
        return msj;

    }

    public long funcionSucesion(double valor1){

        long msj;

        if (valor1 == 0) {
            return 0;

        } else if (valor1 == 1) {
            return 1;

        } else {
            msj = funcionSucesion(valor1 - 1) + funcionSucesion(valor1 - 2);
        }

        return msj;

    }
}
