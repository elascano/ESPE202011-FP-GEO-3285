/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05iterations;

import java.util.Scanner;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class WS05Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i;
        i = 0; //variable
        final float pi = 3.14F; //constant
        System.out.println("pi -> " +pi);
        float radio=1;
        float area=pi * radio * radio;
        

        System.out.println("==== This is a while loop from 1 to 10 ====");

        while (i < 10) {
            System.out.println("i -> " + (i + 1));
            //i += 1;
            i++;
            //i = i + 1;
        }

        System.out.println("first 5 even numbers");
        i = 2;
        while (i <= 10) {
            System.out.println(i + " -> is even");
            i += 2;
        }

        System.out.println("First 5 odd numbers");

        int stop;
        stop = 20;
        for (int j = 1; j < stop; j += 2) {
            System.out.println("odd number -> " + j);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The table you want to study: ");
        int table = scanner.nextInt();

        System.out.println("Multiplication Tables : " + table);
        int top = 12;
        int product = 0;
        for (int j = 1; j <= top; j++) {
            product = table * j;
            System.out.println("9 * " + j + " = " + product);
        }

        System.out.println("pi -> " + pi);
        int number = 9;
        float realNumber = 0.0F;
        
        // 7.7 -> float
        // 7   -> int or float

        realNumber = number; //casting conversión de datos de int a float
        
        System.out.println("integer number  --> " + number);
        System.out.println("float realNumber --> " + realNumber);
        
        realNumber = 6.7F;
        
        number = (int) realNumber; //casting o coversión de datos de float a int
        
        System.out.println("integer number  --> " + number);
        System.out.println("float realNumber --> " + realNumber);
        
        number = (int) Math.round(realNumber);

        System.out.println("integer number  --> " + number);
        System.out.println("float realNumber --> " + realNumber);
        
        
        /*
        
        
        System.out.println("realNumber " + realNumber);
        System.out.println("number ->  " + number);

        realNumber = 5.7F;
        number = (int) realNumber;
        System.out.println("realNumber " + realNumber);
        System.out.println("number ->  " + number);
        
        realNumber = 5.7F;
        number = (int) Math.round(realNumber);
        System.out.println("realNumber " + realNumber);
        System.out.println("number ->  " + number);
        
        */

    }
}
