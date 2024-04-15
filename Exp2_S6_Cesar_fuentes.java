
package exp2_s6_cesar_fuentes;

import java.util.Scanner;

public class Exp2_S6_Cesar_fuentes {

    static int totalEntradas=0;
    
    public Exp2_S6_Cesar_fuentes(){
        totalEntradas ++;
    }
    public static int getTotalEntradas(){
        return totalEntradas;
    }
    static int asientosTotales=140;
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); //esta sería una variable de instancia.
        //defino mis variables locales a utilizar.
        //op= Opciones.
        //ce= Compra de entradas
        //mve= Modificar venta existente.
        //ev= Eliminar venta.
        //ib= Imprimir boleta.
        //s= Salir.
        int op, ce, mve, ev, ib; //variables para el primer menu de opciones.
        int edad=0;
        op=0;
        while (op!=5){
            System.out.println("=====MENU DE VENTA DE ENTRADAS TEATRO MORO=====");
            System.out.println("1.-Compra de entradas.");
            System.out.println("2.-Modificar venta existente.");
            System.out.println("3.-Eliminar venta.");
            System.out.println("4.-Imprimir boleta.");
            System.out.println("5.-Salir.");
            System.out.println("Ingrese su opción: =====>");
            op=entrada.nextInt();
            if(op==1){ 
               
                ce=0;
                   System.out.println("Has seleccionado compra de entradas.");
                   System.out.println("El teatro moro cuenta con cuatro tipo de ansientos.");
                   System.out.println("1.-VIP = $20.000 pesos.");
                   System.out.println("2.-Platea alta = $15.000 pesos.");
                   System.out.println("3.-Platea baja = $13.000 pesos.");
                   System.out.println("4.-Palcos = $10.000 pesos.");
                   System.out.println("5.-Salir."); 
                   System.out.println("Ingrese su opción: =====>");
                   ce=entrada.nextInt();
                   switch (ce){
                       case 1:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.vip;
                         asientos.tipoDeAsiento=asientos.A1; 
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce1-1);
                         System.out.println("Has seleccionado asientos VIP.");
                         System.out.println("El teatro Moro cuenta con 140 asientos totales de los cuales 20 son asientos en VIP.");
                         System.out.println("El precio a pagar es: $"  +tarifas.vip + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=entrada.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.vip -(tarifas.vip*descuentos.descuento)) + " pesos.");
                         System.out.println("la actual disponibilidad de asientos en VIP es de: " +(disponibilidades.ce1-1) + " asientos.");
                         new Exp2_S6_Cesar_fuentes();
                         
                        break;
                       }
                       case 2:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.pa;
                         asientos.tipoDeAsiento=asientos.A2;
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce2-1);
                         System.out.println("Has seleccionado asientos Platea Alta.");
                         System.out.println("El teatro Moro cuenta con 140 asientos totales de los cuales 30 son asientos en Platea Alta.");
                         System.out.println("El precio a pagar es: $"  +tarifas.pa + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=entrada.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.pa -(tarifas.pa*descuentos.descuento)) + " pesos.");
                         System.out.println("la actual disponibilidad actual de asientos en platea alta es de: "+(disponibilidades.ce2-1) +" asientos.");
                         new Exp2_S6_Cesar_fuentes();
                       
                       break;
                       }
                       case 3:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.pb;
                         asientos.tipoDeAsiento=asientos.A3;   
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce3-1);
                         System.out.println("Has seleccionado asientos Platea Baja.");
                         System.out.println("El teatro cuenta con 140 asientos totales de los cuales 40 son asientos en Platea Baja.");
                         System.out.println("El precio a pagar es: $"  +tarifas.pb + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=entrada.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.pb -(tarifas.pb*descuentos.descuento)) + " pesos.");
                         System.out.println("la disponibilidad actual de asientos en platea baja es de: "+(disponibilidades.ce3-1) + " asientos.");
                         new Exp2_S6_Cesar_fuentes();
                         break;
                       }
                       case 4:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.p;
                         asientos.tipoDeAsiento=asientos.A4;
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce4-1);
                         System.out.println("Has seleccionado asientos Palcos.");
                         System.out.println("El teatro Moro cuenta con 140 asientos totales de los cuales 50 son asientos en Palcos.");
                         System.out.println("El precio a pagar es: $"  +tarifas.p + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=entrada.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.p -(tarifas.p*descuentos.descuento)) + " pesos.");
                         System.out.println("la disponibilidad actual de asientos en palco es de: "+(disponibilidades.ce4-1)+" asientos.");
                         new Exp2_S6_Cesar_fuentes();
                         break;
                       }
                       default:
                           System.out.println("Por favor ingrese una opción valida====>");
                         break;
                         } 
                }
            if (op==2){
                System.out.println("Has seleccionado modificar la venta existente.");
                System.out.println("Opción no disponible por el momento.");
            }
            if (op==3){
                System.out.println("Has seleccionado eliminar venta existente.");
                System.out.println("Opción no disponible por el momento.");
            }
            if (op==4){
                System.out.println("Has seleccionado imprimir boleta.");
                System.out.println("El resumen de tu compra es el siguiente =====> ");
                System.out.println(".-Entradas vendidas es: " + Exp2_S6_Cesar_fuentes.getTotalEntradas());
                System.out.println(".-Total de asientos disponibles en el teatro es de: "+(asientosTotales-Exp2_S6_Cesar_fuentes.getTotalEntradas()));
                System.out.println(".-Ubicación del asiento: " +asientos.tipoDeAsiento);
                System.out.println(".-Total de asientos " +asientos.tipoDeAsiento + " es de: " + disponibilidades.disponibilidad + " asientos.");
                System.out.println(".-Precio inicial de la entrada: " +tarifas.tarifa + " pesos");
                System.out.println(".-Descuento aplicado: " +(descuentos.descuento*100)+ "%");
                System.out.println(".-precio final a pagar: "+ (tarifas.tarifa-(tarifas.tarifa*descuentos.descuento))+ " pesos");
            }
            if (op==5){
                System.out.println("Muchas gracias por su compra.");
                System.out.println("Hastra pronto.");
            }
            }
        }
        class tarifas{
          static int tarifa = 0;
          static int vip=20000; //precio vip.
          static int pa=15000; //precio platea alta.
          static int pb=13000; //precio platea baja.
          static int p=10000; //precio palcos.
        }
        class descuentos{
          static double descuento=0;
          static double de=0.10; //descuento escolar del 10%.
          static double dam=0.15; //descuento adulto mayor del 15%.
          static double sd=0; //sin descuento.
        }
        class asientos{
            static String tipoDeAsiento;
            static String A1="V.I.P.";
            static String A2="Platea Alta.";
            static String A3="platea Baja.";
            static String A4="Palcos";
        }
        class disponibilidades{
            static int disponibilidad=0;
            static int ce1=20; //20 asientos disponibles vip.
            static int ce2=30; //30 asientos disponibles platea alta.
            static int ce3=40; //40 asientos di1sponibles platea baja.
            static int ce4=50; //50 asientos disponibles palcos
        }        
    }
    

