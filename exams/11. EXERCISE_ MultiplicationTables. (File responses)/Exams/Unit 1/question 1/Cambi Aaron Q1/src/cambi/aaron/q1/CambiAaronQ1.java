/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambi.aaron.q1;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class CambiAaronQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do{
            System.out.println("Table Multiplication");
            System.out.println("1. Table Multiplication");
            System.out.println("0. Exit");
            option = input.nextInt();
            switch(option){
                case 1:
                    int  table;
                    int stop = 12;
                    int product;
                    System.out.println("Table Multiplication");
                    System.out.println("Enter value of the tabl"
                            + "e multiplication");
                    table = input.nextInt();
                    System.out.println("Table Multiplication " + table );
                    for(int a=1;a <= stop; a++ ){
                        product = table * a;
                        System.out.println(table + "*" + a + " = " + product);
                       
                    }
                    break;
                case 0: 
                    System.out.println("Good bay Friends");
                    System.exit(0);
                    break;
            }
        } while (option != 1);

    }
    
}
