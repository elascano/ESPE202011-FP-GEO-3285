/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acostadomenicaexam2;

import java.util.Scanner;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class AcostaDomenicaExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PART1
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] add = new int[5];
        System.out.println("---------ADD THE NUMERS---------");
        for (int i = 0; i < 5; i++) {
            System.out.print("please enter the number you want to sum " + (i + 1) + " -> ");
            add[i] = input.nextInt();
            sum = calculateSum(sum, add, i);

        }
        System.out.println("The total sum is equal to " + sum);
        System.out.println("");

        //PART2
        float prom = 0;
        float[] average = new float[3];
        float addition = 0;
        System.out.println("---------CALCULATE AVERAGE---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("please enter the number you want to calculate the average " + (i + 1) + " -> ");
            average[i] = input.nextInt(); //input.nextFloat();
            prom = calculateAverage(addition, average, i);

        }
        System.out.println("The average is equal to " + prom);
        System.out.println("");

        //PART3 
        int[] numbers = {12, 23, 34, 98, 87, 65, 0};
        int numb;

        System.out.println("--------SEARCH THE NUMBERS---------");
        System.out.print("please enter the number you want to search ->  ");
        numb = input.nextInt();

        if (findNumber(numb, numbers) == true) {
            System.out.println(numb + " was found");
        } else {
            System.out.println(numb + " is NOT found");
        }

    }

    public static boolean findNumber(int numb, int[] number) {
        boolean found = false;
        for (int i = 0; i < 7; i++) {
            if (numb == number[i]) {
                found = true;
            }

        }
        return found;
    }

    private static float calculateAverage(float[] numbers) {
        float sum = 0;

        for (int i = 0; i < 3; i++) {
            sum = sum + numbers[i];
        }
        float prom = sum / 3;
        return prom;
    }

    private static float calculateAverage(float addition, float[] average, int i) {

        addition = (addition + average[i]);
        float prom = addition / 3;
        return prom;
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int j = 0; j < 5; j++) {
            sum = sum + numbers[j];
        }
        return sum;
    }

    private static int calculateSum(int sum, int[] add, int i) {
        sum = sum + add[i];
        return sum;
    }

}
