package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

             public  static double convertirTemperatura(double num){
                 return (1.8*num +32);
             }
    public static void main(String[] args) throws IOException {
	         // write your code here

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println (" introdusca un ªC : ");
        double num = Double.parseDouble (br.readLine ());

        System.out.println (num + "ªC"+" equivalen "+convertirTemperatura (num)+"ªF");

    }
}
