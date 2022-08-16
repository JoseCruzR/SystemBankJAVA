
package com.mycompany.bancomexbank;


public class cuentaDebito extends cuentaBase{
    protected double retirar;

    public double getDepositar() {
        return depositar;
    }

    public cuentaDebito(double retirar, double montoActual, double apertura, double depositar, String nombreUsuario, int id, String correo) {
        super(montoActual, apertura, depositar, nombreUsuario, id, correo);
        this.retirar = retirar;
    }

    @Override
    public String toString() {
        return "cuentaDebito{" +", nombreUsuario=" 
                + nombreUsuario + ", id=" + id + ", correo=" + correo + "retirar=" + retirar + '}';
    }

   
    
    
}
