/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author JoseC
 */


package com.mycompany.bancomexbank;


public class cuentaAhorro extends cuentaBase{
    protected double invertir;

    public double getInvertir() {
        return invertir;
    }

    public cuentaAhorro(double invertir, double montoActual, double apertura, double depositar, String nombreUsuario, int id, String correo) {
        super(montoActual, apertura, depositar, nombreUsuario, id, correo);
        this.invertir = invertir;
    }

    @Override
    public String toString() {
        return "cuentaAhorro{"+ ", nombreUsuario=" 
                + nombreUsuario + ", id=" + id + ", correo=" + correo + '}';
    }
    
   
    
}
