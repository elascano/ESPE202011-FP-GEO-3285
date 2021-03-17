/** Copyright ESPE-DECC
*/

package sorting;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class BubbleSort {

    public static void sort(int[] integers) {
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
                System.out.print("sorting --> ");
                Sorting.printArray(integers);
            }
            System.out.println("");
        }
    }
    
    public static int add(int a, int b){
        int c;
        c = a + b; //a = 7, b = 9, c = 16
        a = 0;
        b = 0;
        System.out.println("a (inside add()-> " + a);
        System.out.println("b (inside add()-> " + b);

        return c;
    }

}
