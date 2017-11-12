package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println (" Calcular el perimetro de un perimetro  \n ------------------------------------ ");

        System.out.print ("\n  Inserte la base : ");
        int base = Integer.parseInt (br.readLine ());

        System.out.print (" Insertar la altura : ");
        int altura = Integer.parseInt (br.readLine ());
        System.out.println ("\n El perimetro es : "+perimetroRectangulo(base,altura));

    }

    public static int perimetroRectangulo(int base, int altura){
          int perimetro = (base+altura)*2;
        return perimetro;
    }
}
