package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

     //  funcion para calcular la longitud de una circunferencia
      public static double longitudCircunferencia(int rad){
          double pi = 3.14159;

          return 2*pi*rad;
      }

    //funcion para calcular el area del circulo
    public static double areaCircunferencia(int rad){
          double pi = 3.14159;

          return pi*rad*rad;
    }

    // funcion que sirve para calcula el volumen de la esfera

    public static double volumenEsfera(int rad){

         double pi = 3.14159;
         return 4/3*(pi*rad*rad*rad);

    }
    public static void main(String[] args) throws IOException {
        // Recibir datos

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));


        String opcion;
        do {
            System.out.println ("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");

            opcion = br.readLine ();

            System.out.println (" Introdusca el valor del radio : ");
            int radio = Integer.parseInt (br.readLine ());

            switch (opcion) {
                case "a":
                case "A":
                    System.out.println (" La longitud de la circunferencia es : "+longitudCircunferencia (radio));
                    break;
                case "b":
                case "B":
                    System.out.println (" El area de la circunferencia es : "+areaCircunferencia (radio));
                    break;
                case "c":
                case "C":
                    System.out.println (" El volumen de la esfera es : " +volumenEsfera (radio));
                    break;
                case "d":
                case "D":

                    break;
                default:
                    System.out.println (" Opcion erronea ");
            }
        } while (!opcion.equalsIgnoreCase ("d"));
    }
}
