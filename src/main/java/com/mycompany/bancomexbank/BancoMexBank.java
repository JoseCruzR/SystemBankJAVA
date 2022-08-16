
package com.mycompany.bancomexbank;
import java.util.Scanner;

public class BancoMexBank {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        operacionesBanco banco = new operacionesBanco();
        
//----------------------AGREGANDO CUENTAS CREDITO--------------------- 

//               sumInteres SaldoNegativo  limiteCredito Adeudo Apertura depositar NOMBRE ID CORREO
        banco.aCredito(new tarjetaCredito(15,0,18000, 3000, 500, 0,"Jose Cruz Rodriguez",1, "jcr@gmail.com"));
        banco.aCredito(new tarjetaCredito(15,0,2000, 2709, 500, 0,"Javier ibarra",2, "ibarra99@gmail.com"));
        banco.aCredito(new tarjetaCredito(15,0,35000, 40000, 500, 0,"Marco Ramirez",3, "mrgmail.com"));

//----------------------AGREGANDO CUENTAS DEBITO---------------------

//                                      montoTotal apertura nombre id correo
        banco.aDebito(new cuentaDebito(0, 30000, 500, 0,"Jose Rodriguez",1, "jcr@gmail.com"));
         
//----------------------AGREGANDO CUENTAS AHORRO---------------------
        banco.aAhorro(new cuentaAhorro(0, 30000, 500, 0,"Jose Rodriguez",1, "jcr@gmail.com"));
        
//--------------------------------MENU---------------------        
        int auxSwitch;
        int auxSwitch2;
        int auxSwitch3;
        int auxSwitch4;
        
        do {
            System.out.println("Bienvenido al banco MexBank");
            System.out.println("Selecciona con que tipo de cuenta quieres trabajar");
            System.out.println("1.-Tarjetas de Credito\n"
                             + "2.-Cuentas de debito \n"
                             + "3.-Cuentas de ahorro \n"
                             + "5.-Salir");            
            auxSwitch=leer.nextInt();
            
            switch (auxSwitch) {
                
                case 1:
//----------------------TARJETAS DE CREDITO---------------------
                    do {        
                        
            System.out.println("Estas tranajando con tarjetas de credito");
            System.out.println("Selecciona una opcion");
            System.out.println("1.-Status cuenta \n"
                             + "2.-Depositar a cuenta \n"
                             + "3.-Mostrar Cuentas \n"
                             + "4.-Sumar interes \n"
                             + "5.-Salir");            
                        auxSwitch2=leer.nextInt();
                        
                        switch (auxSwitch2) {
//----------------------Status cuenta---------------------
                            case 1:
                                 int idAuxBusq;
                                 double saldoNeg;
                                 
                                 
                                    
                                    System.out.println("Status Cliente");
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                    tarjetaCredito creditoAuxiliar = banco.BuscarCredito(idAuxBusq);
                                    
                                    
                                    if (creditoAuxiliar == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                        if (creditoAuxiliar.getMontoActual()>creditoAuxiliar.getLimiteCredito()) {
                                            saldoNeg=creditoAuxiliar.getLimiteCredito()-creditoAuxiliar.getMontoActual();
                                        }
                                        else{
                                             saldoNeg=0;
                                        }
                                        
                                        System.out.println("Cliente encontrado! : " + creditoAuxiliar);
                                        System.out.println("Adeudo: "+creditoAuxiliar.getMontoActual());
                                        System.out.println("saldoNegativo: "+saldoNeg);
                                        System.out.println("Limite de credito"+creditoAuxiliar.getLimiteCredito());
                                        
                                        
                                    }
                                break;
//----------------------Depositar cuenta---------------------
                                case 2:
                                    double monto,nuevoSal,auxSal;
                                    
                                    System.out.println("Ingrese el monto a depositar");
                                    monto=leer.nextDouble();
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                    tarjetaCredito creditoAuxiliar2 = banco.BuscarCredito(idAuxBusq);
                                    
                                    
                                    if (creditoAuxiliar2 == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                        if (monto>creditoAuxiliar2.getMontoActual()) {
                                            System.out.println("Deposita una cantidad menor a tu deuda");
                                        }
                                        else{
                                            System.out.println("Su deuda era de: "+creditoAuxiliar2.getMontoActual());
                                            auxSal=creditoAuxiliar2.getMontoActual()-monto;
                                            creditoAuxiliar2.setMontoActual(auxSal); 
                                            System.out.println("Su deuda actual es de: "+creditoAuxiliar2.getMontoActual());
                                        }
                                        
                                    }
                                break;
                                
//----------------------Mostrar cuenta---------------------
                                case 3: 
                                    banco.mostrarClientesCre();
                                break;
                                
//----------------------Suma interes---------------------
                                case 4:
                                    double sumInt;
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                    tarjetaCredito creditoAuxiliar3 = banco.BuscarCredito(idAuxBusq);
                                    
                                    
                                    if (creditoAuxiliar3 == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                        sumInt=(creditoAuxiliar3.getMontoActual()*.15)+creditoAuxiliar3.getMontoActual();
                                        creditoAuxiliar3.setMontoActual(sumInt); 
                                            
                                            System.out.println("Su deuda con interes es de: "+creditoAuxiliar3.getMontoActual()); 
                                    }
                                
                                break;
                            
                            
                        }
                        } while (auxSwitch2<5);
    
                break;

//----------------------------------CUENTA DEBITO------------------------------
                case 2:
                    do {        
                        
                        System.out.println("Estas trabajando con cuentas de debito");
            System.out.println("Selecciona una opcion");
            System.out.println("1.-Status cuenta \n"
                             + "2.-Retirar \n"
                             + "3.-Depositar \n"
                             + "5.-Salir");            
                        auxSwitch4=leer.nextInt();
                        
                        switch (auxSwitch4) {
//----------------------Suma interes---------------------
                            case 1:
                                 int idAuxBusq;
                                 double saldoNeg;
                                 
                                 
                                    
                                    System.out.println("Status Cliente cuenta debito");
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                    cuentaDebito debitoAuxiliar = banco.BuscarDebito(idAuxBusq);
                                    
                                    
                                    if (debitoAuxiliar == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                       
                                        System.out.println("Cliente encontrado! : " + debitoAuxiliar);
                                        System.out.println("Saldo: "+debitoAuxiliar.getMontoActual());
                                        
                                    }
                            break;
//----------------------Retira---------------------
                            case 2:
                                double auxRetirar;
                                 System.out.println("Retirar de cuenta debito");
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                    cuentaDebito debitoAuxiliar2 = banco.BuscarDebito(idAuxBusq);
                                    
                                    
                                    if (debitoAuxiliar2 == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                       
                                        System.out.println("Cliente encontrado! : " + debitoAuxiliar2);
                                        System.out.println("Saldo: "+debitoAuxiliar2.getMontoActual());
                                        System.out.println("Cuanto deseas retirar?");
                                        auxRetirar=leer.nextDouble();
                                        if (auxRetirar>debitoAuxiliar2.getMontoActual()) {
                                            System.out.println("No puedes retirar mas dinero del que tienes");
                                        }
                                        else{
                                            auxRetirar=debitoAuxiliar2.getMontoActual()-auxRetirar;
                                            debitoAuxiliar2.setMontoActual(auxRetirar);
                                            System.out.println("Saldo restante"+ debitoAuxiliar2.getMontoActual());
                                        }
                                        
                                        
                                        
                                    }
                            break;
//----------------------Depositar---------------------
                            case 3:
                                 double auxDepositar;
                                 System.out.println("Despoitar a cuenta debito");
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                    cuentaDebito debitoAuxiliar3 = banco.BuscarDebito(idAuxBusq);
                                    
                                    
                                    if (debitoAuxiliar3 == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                       
                                        System.out.println("Cliente encontrado! : " + debitoAuxiliar3);
                                        System.out.println("Saldo: "+debitoAuxiliar3.getMontoActual());
                                        System.out.println("Cuanto quieres despositar?");
                                        auxDepositar=leer.nextDouble();
                                            System.out.println("Tu saldo es de"+ debitoAuxiliar3.getMontoActual());
                                            auxDepositar=debitoAuxiliar3.getMontoActual()+auxDepositar;
                                            debitoAuxiliar3.setMontoActual(auxDepositar);
                                            System.out.println("Tu nuevo saldo es de"+ debitoAuxiliar3.getMontoActual());   
                                    }
                            break;
                        }
                    } while (auxSwitch4<5);
                break;
//----------------------------------CUENTA AHORRO------------------------------
                case 3:
                    do {         
                        
            System.out.println("Estas trabajando con cuentas de ahorro");
            System.out.println("Selecciona una opcion");
            System.out.println("1.-Status cuenta \n"
                             + "2.-Abonar a cuenta \n"
                             + "3.-Invertir \n"
                             + "5.-Salir");            
                        auxSwitch3=leer.nextInt();
                        switch (auxSwitch3) {
                            case 1:
                                int idAuxBusq;
   
                                    System.out.println("Status Cliente cuenta de ahorro");
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                    cuentaAhorro ahorroAuxiliar = banco.BuscarAhorro(idAuxBusq);
                                    
                                    if (ahorroAuxiliar == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                       
                                        System.out.println("Cliente encontrado! : " + ahorroAuxiliar);
                                        System.out.println("Saldo de ahorro: "+ahorroAuxiliar.getMontoActual());
                                        
                                    }
                            break;
//----------------------Abonar a cuenta ahorro---------------------
                            case 2:
                                 double auxDepositar;
                                 System.out.println("Abonar a cuenta de ahorro");
                                    System.out.println("Dame el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                     cuentaAhorro ahorroAuxiliar2 = banco.BuscarAhorro(idAuxBusq);
                                    
                                    
                                    if (ahorroAuxiliar2 == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                       
                                        System.out.println("Cliente encontrado! : " + ahorroAuxiliar2);
                                        System.out.println("Saldo: "+ahorroAuxiliar2.getMontoActual());
                                        System.out.println("Cuanto quieres despositar?");
                                        auxDepositar=leer.nextDouble();
                                            System.out.println("Tu saldo de ahorro es de"+ ahorroAuxiliar2.getMontoActual());
                                            auxDepositar=ahorroAuxiliar2.getMontoActual()+auxDepositar;
                                            ahorroAuxiliar2.setMontoActual(auxDepositar);
                                            System.out.println("Tu nuevo saldo es de"+ ahorroAuxiliar2.getMontoActual());   
                                    }
                                
                            break;
                            case 3:
//----------------------Invertir---------------------
                                 double auxInvertir;
                                 System.out.println("Invertir en cuenta de ahorro");
                                    System.out.println("Ingrese el ID del cliente");
                                    idAuxBusq=leer.nextInt();
                                    
                                     cuentaAhorro ahorroAuxiliar3 = banco.BuscarAhorro(idAuxBusq);
                                    
                                    
                                    if (ahorroAuxiliar3 == null) {
                                        System.out.println("Cliente no encontrado");
                                    } else {
                                       
                                        System.out.println("Cliente encontrado! : " + ahorroAuxiliar3);
                                        System.out.println("Saldo: "+ahorroAuxiliar3.getMontoActual());
                                        
                                            System.out.println("Tu saldo de ahorro es de"+ ahorroAuxiliar3.getMontoActual());
                                            auxInvertir=(ahorroAuxiliar3.getMontoActual()*.10)+ahorroAuxiliar3.getMontoActual();
                                            ahorroAuxiliar3.setMontoActual(auxInvertir);
                                            System.out.println("Tu nuevo saldo es de"+ ahorroAuxiliar3.getMontoActual());   
                                    }
                            break;
                            
                        }
                        
                    } while (auxSwitch3<5);
                    
                break;
                        }
            
        } while (auxSwitch<4);
        
    }
}
