package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static double calcularCambio(String moneda, double cantidadMoneda){
  double cambio=0;
        switch ( moneda ){

            case "USD":
                cambio= cantidadMoneda*1.0831;
                System.out.println ("----"+cantidadMoneda+" euros son "+cambio);

            break;
            case "GBP":
                cambio = cantidadMoneda*1.3;
                System.out.println ("----"+cantidadMoneda+" euros son "+cambio);

            break;
            case "CNY":
                cambio = cantidadMoneda*1.2;
                System.out.println ("----"+cantidadMoneda+" euros son "+cambio);

            break;
            case "JPY":
                cambio = cantidadMoneda*0.3476;
                System.out.println ("----"+cantidadMoneda+" euros son "+cambio);

            break;
        }

        return cambio;
    }

    public static void main(String[] args) throws IOException {
	// write your code here


        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.print ("Introdusca una cantidad en euro : ");
        double cantidad = Double.parseDouble (br.readLine ());
        String moneda;

     System.out.println ("Moneda a la que convertir (USD, GBP, CNY, JPY): JPY\n");
     moneda = br.readLine ();


        System.out.println (calcularCambio(moneda,cantidad));

    }


}
