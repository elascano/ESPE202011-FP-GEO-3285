/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchezeq11.java;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class SanchezEQ11Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    
        int sum = 0;
       
        int[] array = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the " + i + " num:");
            array[i] = ent.nextInt();
            sum += array[i];

        }
        for (int i = 0; i < 5; i++) {

            System.out.println("In the position" + (i + 1) + " you save: " + array[i]);
              System.out.println("the total sum is: "+sum);
            Scanner sc=new Scanner(System.in);
        }
    
        int i ;
        float s=0,p=3;
                 int[ ] a = new int[3];

         for (i=0 ; i <3 ; i ++){
             System.out.println("enter the integer : "+(i+1));
                                                                                                                          
             a[i]=sc.nextInt();            
         }
        for ( i = 0; i < a.length; i++) {
        s =s + a[i];
    
        p = s / a.length;
         }
        System.out.println("the average is: "+p);
        
        
          }
    {
        
        
        int[] array = new int[7];
        int[] array2 = new int[]{ 12, 23, 34, 98, 87, 65, 0 };
        int sum;
        float average;
        
        System.out.println("Please enter 7 numbers");
        System.out.println("\n");
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
            input.nextLine();
            
             }
        
        sum = sumarray(array);
        
        System.out.println();
        System.out.println("sum: " + sum);

    

}  


    private int sumarray(int[] array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


        
        
        
    }
}
0