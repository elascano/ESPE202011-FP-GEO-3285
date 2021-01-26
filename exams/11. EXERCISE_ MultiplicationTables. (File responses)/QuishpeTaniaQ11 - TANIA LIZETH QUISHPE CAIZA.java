/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quishpe.tania.q11;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class QuishpeTaniaQ11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

       
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> indica las tabla dde multiplicar 6");
            System.out.println("2. -> Salir ");
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

               case 1:
                    Scanner obtenerNumero = new Scanner(System.in);

        int numero,i,j;
      System.out.print("indica la tabla de multiplicar:6 ");
      
      numero = obtenerNumero.nextInt();
     for(j = 1; j <= 10; j++)

            {

                System.out.println(numero + " X " + j + " = " + numero*j);

            } 

      
    
