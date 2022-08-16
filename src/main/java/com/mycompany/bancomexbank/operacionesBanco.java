package com.mycompany.bancomexbank;
import java.util.ArrayList;

public class operacionesBanco {
    
    private ArrayList<tarjetaCredito> cCredito;
    private ArrayList<cuentaDebito> cDebito;
    private ArrayList<cuentaAhorro> cAhorro;
    
    public operacionesBanco() {
        
        this.cCredito = new ArrayList<>();
        this.cDebito = new ArrayList<>();
        this.cAhorro = new ArrayList<>();
    }
    
//---------------------OPERACIONES CREDITO----------------
    
    public void aCredito(tarjetaCredito a){
        this.cCredito.add(a);
    }
    
    public tarjetaCredito BuscarCredito(int id){
        tarjetaCredito clienteEncontrado = null;

        for (tarjetaCredito elemento : cCredito) {
            if (elemento.getId() == id) {
                clienteEncontrado = elemento;
            }
        }
        return clienteEncontrado;
    }
    
    public void mostrarClientesCre(){
        for (tarjetaCredito element : cCredito) {
            System.out.println(element);
        }
    }
    
    public int cantidadCuentasCre(){
        return cCredito.size();
    }

//---------------------OPERACIONES DEBITO----------------
     public void aDebito(cuentaDebito a){
        this.cDebito.add(a);
    }
    
    public cuentaDebito BuscarDebito(int id){
        cuentaDebito clienteEncontrado = null;

        for (cuentaDebito elemento : cDebito) {
            if (elemento.getId() == id) {
                clienteEncontrado = elemento;
            }
        }
        return clienteEncontrado;
    }
    
    public void mostrarClientesDeb(){
        for (cuentaDebito element : cDebito) {
            System.out.println(element);
        }
    }
    
    public int cantidadCuentasDeb(){
        return cDebito.size();
    }
    
//---------------------OPERACIONES AHORRO----------------
    
     public void aAhorro(cuentaAhorro a){
        this.cAhorro.add(a);
    }
    
    public cuentaAhorro BuscarAhorro(int id){
        cuentaAhorro clienteEncontrado = null;

        for (cuentaAhorro elemento : cAhorro) {
            if (elemento.getId() == id) {
                clienteEncontrado = elemento;
            }
        }
        return clienteEncontrado;
    }
    
    public void mostrarClientesAho(){
        for (cuentaAhorro element : cAhorro) {
            System.out.println(element);
        }
    }
    
    public int cantidadCuentasAho(){
        return cAhorro.size();
    }
}

