package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class testovning1 {
    Scanner scanner = new Scanner(System.in);
    public testovning1(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Number " + i+1 + ": ");
            arr[i] = scanner.nextInt();

        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int sum = Arrays.stream(arr).sum();
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("max: " + max + " min: " + min + " sum: " + sum + " avg: " + avg);

    }
}
