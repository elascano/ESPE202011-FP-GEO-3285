/** Copyright ESPE-DECC
*/

package ws10functions;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
import java.util.Scanner;

public class CalderonDQ11 {

    public static void main(String[] args) {
        //Add the elements of an array5Int of 5 integers:
        Scanner data = new Scanner(System.in);
        System.out.println("-- ADD 5 ELEMENTS OF AN ARRAY -- ");
        int sum = 0;
        int[] array5Int = new int[5];
        System.out.print("Enter first integer number: ");
        array5Int[0] = data.nextInt();
        System.out.print("Enter second integer number: ");
        array5Int[1] = data.nextInt();
        System.out.print("Enter third integer number: ");
        array5Int[2] = data.nextInt();
        System.out.print("Enter fourth integer number: ");
        array5Int[3] = data.nextInt();
        System.out.print("Enter fifth integer number: ");
        array5Int[4] = data.nextInt();
        sum = addElements(array5Int);
        System.out.println(array5Int[0] + " + " + array5Int[1] + " + " + array5Int[2] + " + "
                + array5Int[3] + " + " + array5Int[4] + " = " + sum);
        System.out.println();

        // Compute the array3Float of three elements of an array5Int of floats:
        System.out.println("-- AVERAGE OF THREE ELEMENTS-- ");
        float[] array3Float = new float[3];
        float average;
        System.out.print("Enter first average (float): ");
        array3Float[0] = data.nextFloat();
        System.out.print("Enter second average (float): ");
        array3Float[1] = data.nextFloat();
        System.out.print("Enter third average (float): ");
        array3Float[2] = data.nextFloat();
        average = computeAverage(array3Float);
        System.out.println("The average of: " + array3Float[0] + " , " + array3Float[1]
                + " , " + array3Float[2] + " = " + average);
        System.out.println();
        
        //Find out if a specific integer is part of an array:
        System.out.println("-- FIND OUT IF A SPECIFIC INTEGER NUMBER IS PART OF "
                + " AN ARRAY -- ");
        int [] matrix = {12,23,34,98,87,65,0};
        int userNumber;
        System.out.print("Number to search: ");
        userNumber = data.nextInt();
        findSpecificInt(matrix, userNumber);
     

    }

    private static void findSpecificInt(int[] matrix, int userNumber) {
        for (int i=0; i<matrix.length; i++){
            if (userNumber == matrix [i]){
                System.out.println(matrix[i] + " is part of the matrix ");
                System.exit(0);
            }
            
        }
        System.out.println("Plese try again ...");
    }

    private static float computeAverage(float[] array3Float) {
        float average;
        average = (array3Float[0] + array3Float[1] + array3Float[2]) / 3;
        return average;
    }

    private static int addElements(int[] array) {
        int sum;
        sum = array[0] + array[1] + array[2] + array[3] + array[4];
        return sum;
    }

}
