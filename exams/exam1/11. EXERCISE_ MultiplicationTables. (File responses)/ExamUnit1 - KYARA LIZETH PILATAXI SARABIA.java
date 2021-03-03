/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit1;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class ExamUnit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Multiplication table of 6");
            System.out.println("2. -> Exit");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                
                case 1:
                    
                    System.out.println("Multiplication Tables : 6");
                    int top=12;
                    int product=0;
                    int table = 1;
                    for (int y = 1 ; y <= top ; y++){
                    product = table * y;
                    System.out.println("6 * " + y + " = " + product);
                    
        }    
    }
    
}
    }

            
                                 

        
    