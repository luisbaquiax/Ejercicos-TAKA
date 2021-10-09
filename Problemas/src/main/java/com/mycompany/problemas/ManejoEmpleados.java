/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.problemas;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ManejoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner scaner = new Scanner(System.in);
        System.out.println("cantidad de empleados");

        Empleado[] listaEmpleados = new Empleado[scaner.nextInt()];
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println("Ingrese el nombre del empleado "+(i+1));
            String nombre = scaner.next();
            System.out.println("Ingrese el departamento"+(i+1));
            int departamento = scaner.nextInt();
            System.out.println("Ingrese la cantidad de horas que ha trabajado"+(i+1));
            int horas = scaner.nextInt();
            System.out.println("Ingrese el pago de este empleado"+(i+1));
            double pago = Double.parseDouble(scaner.next());
            listaEmpleados[i] = new Empleado(nombre, departamento, horas, pago);
            System.out.println("");
        }
        System.out.println("LIstado empleados que trabajaron cuarenta o más horas");
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getHorasTrabajados() >= 40) {
                System.out.println(empleado.toString());
            }
        }
        System.out.println("LIstado empleados que trabajaron menos de cuaretna horas");
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getHorasTrabajados() < 40) {
                System.out.println(empleado.toString());
            }
        }
    }

}
