/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aguirrearielq11;

/**
 *
 * @author Gabriel
 */
public class AguirreArielQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
    boolean mainLoop = true;
    int option ;
    
    do{
        
        System.out.println("===Calculator===");
        System.out.println("1. ->Addiction");
        System.out.println("2. ->Subtraction");
        System.out.println("3. ->Multiplication");
        System.out.println("4. ->Division");
        System.out.println("5. ->Exit");
    
    System.out.println("Enter your menu option -->");
    option = input.nextInt();
    
     switch (option){
          
         case 1:
             int addend1;
             int addend2;
             int sum = 0;
             System.out.println("enter addend 1 -> ");
             addend1 = input.nextInt();
             System.out.println("enter addend 2 -> ");
             addend2 = input.nextInt();
             int i;
    i = 0;
 
   
    System.out.println("Multiplication Tables : 7");
    int top=12;
    int product=0;
    int table=7;
    for (int j = 1 ; j <= top ; j++){
    product =table * j;
    System.out.println("7 * " + j + " = " + product);
             System.out.println("The sum is -->" + sum);
             break;
         
             case 2:
             System.out.println("The subtraction is ");
             i = 0;
 
   
    System.out.println("Multiplication Tables : 7");
    int top=12;
    int product=0;
    int table=7;
    for (int j = 1 ; j <= top ; j++){
    product =table * j;
    System.out.println("7 * " + j + " = " + product);
             break;
         case 3:
             System.out.println("The multiplication is ");
             i = 0;
 
   
    System.out.println("Multiplication Tables : 7");
    int top=12;
    int product=0;
    int table=7;
    for (int j = 1 ; j <= top ; j++){
    product =table * j;
    System.out.println("7 * " + j + " = " + product);
             break;
         case 4:
             System.out.println("The division is ");
             break;
         case 5:
             System.out.println("Good Bye my friend ");
             System.exit(0);
             break;
         default:
             System.out.println("Invalid option\n\n\n");
             break;
             
             
             
     
         
     
    
    
              }
           } while (option!= 5);
        
    }
    
}
