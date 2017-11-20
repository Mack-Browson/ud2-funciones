package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int fibonnacci(int n){


        if (n< 2){
            return n;
        }else {
           return fibonnacci (n-1)+fibonnacci (n-2);
        }
    }

    public static int fibIterativo(int n){

          int a = 0;
          int b = 1;
          int c;

        for (int k = 0; k<n; k++){

              c = b+a;
              a=b;
              b=c;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {


	// write your code here

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("  give me number please : ");
       int n = Integer.parseInt (br.readLine ());
        System.out.println (" sucesiones de fibonnacci : "+fibonnacci (n));
        System.out.println (" sucesiones de fibonnacci : "+fibIterativo (n));



    }
}
