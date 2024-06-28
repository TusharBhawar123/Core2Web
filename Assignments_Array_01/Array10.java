package Assignments_Array_01;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size -> ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the Arrays Elements -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int num1:arr){
            System.out.println(num1);
        }
    }
}
