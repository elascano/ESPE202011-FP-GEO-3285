/** Copyright ESPE-DECC
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class Matrix implements IMatrix {

    private float[][] matrix;

    public float[][] read() {
        //TODO code to read the matrix using the keyboard
        float[][] m = {{2, 3}, {3, 7}, {9, 4}};

        return m;
    }

    public float[][] read(int m, int n, String name, Scanner input) {
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println(" -- ROW Number " + (i + 1) + " --");
            for (int j = 0; j < n; j++) {
                System.out.print(name + "[" + (i + 1) + "][" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    @Override
    public void prettyPrint(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌ \t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");

                    } else {
                        System.out.print("│\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print(" \t┐");
                    } else if (i == m - 1) {
                        System.out.print(" \t┘");

                    } else {
                        System.out.print("  \t│");
                    }
                }
            }
        }
        System.out.println("");

    }

}
