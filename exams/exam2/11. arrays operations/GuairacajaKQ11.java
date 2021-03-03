package guairacajakq11;

import java.util.Scanner;

public class GuairacajaKQ11 {

    public static void main(String[] args) {

        System.out.println("=============== Kevin Andres Guairacaja ===============");
        Scanner e = new Scanner(System.in);
        
        System.out.println("1. Add Elements: ");
        printMatrixA(e);

        System.out.println("\n2. Compute the Average");
        computeTheAverage(e);
        
        System.out.println("\n3. Find the Number");
        findTheNumber(e);
      
       
    }

    public static void findTheNumber(Scanner e) {
        System.out.println("Please Enter An Number: ");
        int scanner9 = e.nextInt();
        System.out.println("Matrix C is: ");
        System.out.println("["+12+" "+23+" "+34+" "+98+" "+87+" "+65+" "+0+"]");
        int j = 0;
        
    }

    public static void printMatrixA(Scanner e) {
        System.out.println("Enter the 5 elements of the Array A: ");
        int scanner1 = e.nextInt();
        int scanner2 = e.nextInt();
        int scanner3 = e.nextInt();
        int scanner4 = e.nextInt();
        int scanner5 = e.nextInt();
        System.out.println("The Matrix A is: ");
        System.out.println("["+" "+scanner1+" "+scanner2+" "+scanner3+" "+scanner4+" "+scanner5+" "+ "]");
    }

    public static void computeTheAverage(Scanner e) {
        System.out.println("Please enter thre values to Array B: ");
        float scanner6 = e.nextFloat();
        float scanner7 = e.nextFloat();
        float scanner8 = e.nextFloat();
        float average=0;
        System.out.println("The matrix B is:");
        System.out.println("["+" "+scanner6+" "+scanner7+" "+scanner8+" "+ "]");
        average = (scanner6+scanner7+scanner8)/3;
        System.out.println("The average of the elements of Arrays B is: \n" +average);
    }
    

    
}