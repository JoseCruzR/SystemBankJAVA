

package com.mycompany.bancomexbank;


public class tarjetaCredito extends cuentaBase{
    protected double sumaInteres;
    protected double saldoNegativo;
    protected double limiteCredito;

    public double getSumaInteres() {
        return sumaInteres;
    }

    public double getSaldoNegativo() {
        return saldoNegativo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setSumaInteres(double sumaInteres) {
        this.sumaInteres = sumaInteres;
    }

    public void setSaldoNegativo(double saldoNegativo) {
        this.saldoNegativo = saldoNegativo;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public tarjetaCredito(double sumaInteres, double saldoNegativo, double limiteCredito, double montoActual, double apertura, double depositar, String nombreUsuario, int id, String correo) {
        super(montoActual, apertura, depositar, nombreUsuario, id, correo);
        this.sumaInteres = sumaInteres;
        this.saldoNegativo = saldoNegativo;
        this.limiteCredito = limiteCredito;
    }

    

    @Override
    public String toString() {
        return "tarjetaCredito{" +", nombreUsuario=" 
                + nombreUsuario + ", id=" + id + ", correo=" + correo + '}';
    }
    
    
}
