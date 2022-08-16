
package com.mycompany.bancomexbank;

public class cuentaBase {
    protected double montoActual;
    protected double apertura;
    protected double depositar;
    
    protected String nombreUsuario;
    protected int id;
    protected String correo;

    public double getMontoActual() {
        return montoActual;
    }

    public double getApertura() {
        return apertura;
    }

    public double getDepositar() {
        return depositar;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getId() {
        return id;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    public String getCorreo() {
        return correo;
    }

    public cuentaBase(double montoActual, double apertura, double depositar, String nombreUsuario, int id, String correo) {
        this.montoActual = montoActual;
        this.apertura = apertura;
        this.depositar = depositar;
        this.nombreUsuario = nombreUsuario;
        this.id = id;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "cuentaBase{" + "montoActual=" + montoActual + ", apertura=" 
                + apertura + ", depositar=" + depositar + ", nombreUsuario=" 
                + nombreUsuario + ", id=" + id + ", correo=" + correo + '}';
    }
    
}
