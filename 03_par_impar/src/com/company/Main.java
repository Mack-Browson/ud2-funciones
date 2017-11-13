package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

       public static boolean esPar(int num){
           if (num%2 == 0)
               return true;
           else
           return false;
       }

       public static boolean esImpar(int m){
           if (m%2 !=0)
               return true;
            else
                return false;
       }
    public static void main(String[] args) throws IOException {
	// recibir datos del teclado

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.print (" Introdusca un numero : ");
        int numero = Integer.parseInt (br.readLine ());

        if (!esImpar (numero))
            System.out.println (" es Par");
        else
            System.out.println ("es Impar");


    }
}
