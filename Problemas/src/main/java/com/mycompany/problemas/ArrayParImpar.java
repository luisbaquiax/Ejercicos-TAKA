/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.problemas;

/**
 *
 * @author luis
 */
public class ArrayParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(countBits(1234));
    }

    /**
     * Instrucciones:<br><br>
     * Write a function that takes an integer as input, and returns the number
     * of bits that are equal to one in the binary representation of that
     * number. You can guarantee that input is non-negative.
     * <br><br>
     * Cuenta los uno en una cadena binaria del número que se le pasa por
     * parámetro
     *
     * @param n
     * @return la suma de "unos"
     */
    public static int countBits(int n) {
        // Show me the code!
        return sum(Integer.toBinaryString(n));
    }

    /**
     *
     * Este metodo suma cada elemento de la cadena de parámetro
     *
     * @param number
     * @return
     */
    public static int sum(String number) {
        int aux = 0;
        for (int i = 0; i < number.length(); i++) {
            aux += Integer.parseInt(number.charAt(i) + "");
        }
        return aux;
    }

    public static String spinWords(String sentence) {
        String reverse = "";
        String[] cadenas = sentence.split(" ");
        //solcion 2
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() >= 5) {
                cadenas[i] = new StringBuilder(cadenas[i]).reverse().toString();
            }
        }
        return String.join(" ", cadenas);
        //mi solución
//        if (cadenas.length == 1) {
//            return palabraInvertida(sentence);
//        } else {
//            for (int i = 0; i < cadenas.length; i++) {
//                if (tieneCincoLetras(cadenas[i])) {
//                    cadenas[i] = palabraInvertida(cadenas[i]);
//                }
//            }
//            for (int i = 0; i < cadenas.length - 1; i++) {
//                reverse += cadenas[i] + " ";
//            }
//            reverse += cadenas[cadenas.length - 1];
//        }
//
//        return reverse;
    }

    public static boolean tieneCincoLetras(String palabra) {
        return (palabra.length() >= 5);
    }

    public static String palabraInvertida(String paString) {
        String aux = "";
        for (int i = paString.toCharArray().length - 1; i >= 0; i--) {
            aux += paString.charAt(i);
        }
        return aux;
    }

    public static int find(int[] integers) {
        int contadorPar = 0;
        int intTemp = 0;
        int contadorImpar = 0;
        int intTempImpar = 0;
        for (int entero : integers) {
            if (entero % 2 == 0) {
                intTemp = entero;
                contadorPar++;
            } else {
                intTempImpar = entero;
                contadorImpar++;
            }
        }
        if (contadorPar == 1) {
            return intTemp;
        } else {
            return intTempImpar;
        }
    }
}
