package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

        public static long calcularFactorial(long n){

            long factorial = 1;
            if (n >= 0){

                for (int i = 1; i<=n; i++){
                    factorial *=i;
                }
            }

            return factorial;
        }
    public static void main(String[] args) throws IOException {
	// recibir datos

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println (" dame un valor a calcular su factorial :");
        int n ;
        do {
             n = Integer.parseInt (br.readLine ());
            System.out.println (" El factorial es : "+calcularFactorial (n));
        }while ((n>=0));

    }
}
