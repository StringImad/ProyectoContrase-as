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
    //Declaracion de objeto
    private static Random aleatorio = new Random();

    public static void main(String[] args) {
        //Declaracion de variables
        int num1, num2, num3, num4;
        String contrasenaGenerada;
        char letraGenerada;
        //Esta variable es true cuando comprueba que la suma no es impar y la multiplicacion no es par
        boolean comprobadorParImpar = true;
        boolean comprobadorNumerosDistintos = true;
        //Bucle de repeticion si uno de los numeros generados es igual o la suma del num 1 y 4 es par o la multiplicacion del numero 2 y 3 es impar
        do {
            //inicializacion de variables con el metodo que genera aleatorios con dos rangos que le damos
            num1 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            num2 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            num3 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            num4 = generadorNumeroAleatorioEntreDosRangos(0, 9);
            //Casting eXplicito de int a char
            letraGenerada = (char) generadorNumeroAleatorioEntreDosRangos(70, 88);
            comprobadorParImpar = comprobadorCumplimientoCondicionParImpar(num1, num2, num3, num4);
            comprobadorNumerosDistintos = comprobadorCumplimientoCondicionNumerosDistintos(num1, num2, num3, num4);
            contrasenaGenerada = num1 + "" + num2 + "" + num3 + "" + num4 + "" + letraGenerada;
            System.out.println(contrasenaGenerada);

        } while (comprobadorNumerosDistintos|| comprobadorParImpar);

        System.out.println("--------" + contrasenaGenerada + "------------");
    }

    //metodo parametriado que recibe 4 numeros y devuelve un booleano, si la suma de los numeros 1 y 4 el resto es 0 significa que es par,
    //por lo tanto el comprobador se vuelve true 
    //y si la multiplicacion es distinta a 0 significa que es impar por lo tanto el comprobador tambien es true y devolvemos el comprobador
    private static boolean comprobadorCumplimientoCondicionParImpar(int numero1, int numero2, int numero3, int numero4) {
        return  ((numero1 + numero4) % 2 == 0 || ((numero2 * numero3) % 2 != 0));
    }
    
    //metodo parametriado que recibe 4 numeros y devuelve un booleano dependiendo si son numeros distintoes entre ellos
    private static boolean comprobadorCumplimientoCondicionNumerosDistintos(int num1, int num2, int num3, int num4) {
        return  (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4);
    }

    // Método generadorNumeroAleatorioEntreDosRangos. Sólo se utiliza en la clase GeneradorContrasenas
    // método privado. recibe dos parámetros y  devuelve valor generado aleatroiamente entre los dos parametros recibidos
    private static int generadorNumeroAleatorioEntreDosRangos(int RANGO_MIN, int RANGO_MAX) {
        return aleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
    }

}
