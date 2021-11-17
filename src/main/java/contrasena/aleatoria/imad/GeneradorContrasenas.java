/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrasena.aleatoria.imad;

import java.util.Random;

/**
 *
 * @author imad
 */
public class GeneradorContrasenas {

    private static Random aleatorio = new Random();

    public static void main(String[] args) {
        //Declaracion de variables
        int num1, num2, num3, num4;
        char letraGenerada;
        //Esta variable es true cuando comprueba que un numero no es impar
        boolean comprobadorImpar = true;
        //Esta variable es true cuando comprueba que un numero no es impar
        boolean comprobadorPar = true;
        //Bucle de repeticion si uno de los numeros generados es igual o la suma del num 1 y 4 es par
        do {
            //inicializacion de variables con el metodo que genera aleatorios con dos rangos que le damos
            num1 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            num2 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            num3 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            num4 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            //Si la suma de los numeros el resto es 0 significa que  es par, por lo tanto el comprobador se vuelve true
            if ((num1 + num4) % 2 == 0 || ((num2 * num3) % 2 != 0)) {
                comprobadorImpar = true;
            } else {
                comprobadorImpar = false;
            }

        } while ((num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4) || comprobadorImpar);
        System.out.println("numero 1: " + num1);
        System.out.println("numero:2: " + num2);
        System.out.println("numero 3: " + num3);
        System.out.println("numero 4: " + num4);

    }
    // Método generadorNumeroAleatorioEntreDosRangos. Sólo se utiliza en la clase AdivinaElNumeroImad
    // método privado. recibe dos parámetros y  devuelve valor generado aleatroiamente entre los dos parametros recibidos

    private static int generadorNumeroAleatorioEntreDosRangos(int RANGO_MIN, int RANGO_MAX) {
        int numeroGeneradoAleatorio;
        numeroGeneradoAleatorio = aleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
        return numeroGeneradoAleatorio;
    }

}
