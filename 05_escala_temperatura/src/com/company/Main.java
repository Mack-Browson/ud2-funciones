package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public  static double convertirTemperatura(double num, String escala){
        if (escala.equalsIgnoreCase ("F"))
            return (1.8*num + 32);
        else
            return 273+num;
    }


    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int opcion;
     do {
      System.out.println ("=== Temperaturas ===\n" +
              "1. Convertir a Fahrenheit\n" +
              "2. Convertir a Kelvin\n" +
              "3. Salir\n" +
              "Opción:");

      opcion = Integer.parseInt (br.readLine ());
         System.out.println (" dame un valor : ");
         double numero = Double.parseDouble (br.readLine ());
      switch (opcion){
          case 1:
              System.out.println (" Fahrengeit : "+convertirTemperatura (numero,"F"));
              break;
          case 2:
              System.out.println (" Fahrengeit : "+convertirTemperatura (numero,"K"));
              break;
          case 3:
              break;
      }

        }while (opcion != 3);
    }
}
