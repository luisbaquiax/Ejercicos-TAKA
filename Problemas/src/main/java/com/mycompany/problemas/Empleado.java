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
public class Empleado {

    private String nombre;
    private int numeroDepartamento;
    private int horasTrabajados;
    private double pagoPorHora;
    /**
     * 
     * @param nombre
     * @param numeroDepartamento
     * @param horasTrabajados
     * @param pagoPorHora 
     */
    public Empleado(String nombre, int numeroDepartamento, int horasTrabajados, double pagoPorHora) {
        this.nombre = nombre;
        this.numeroDepartamento = numeroDepartamento;
        this.horasTrabajados = horasTrabajados;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numeroDepartamento=" + numeroDepartamento + ", horasTrabajados=" + horasTrabajados + ", pagoPorHora=" + pagoPorHora + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the numeroDepartamento
     */
    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }

    /**
     * @return the horasTrabajados
     */
    public int getHorasTrabajados() {
        return horasTrabajados;
    }

    /**
     * @return the pagoPorHora
     */
    public double getPagoPorHora() {
        return pagoPorHora;
    }

}
