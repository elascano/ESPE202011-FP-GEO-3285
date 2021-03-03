/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public interface IMatrix {
    float[][] read();
    void prettyPrint(int m, int n, float[][] matrix);
    float [][] read(int m, int n, String name, Scanner input);
}
