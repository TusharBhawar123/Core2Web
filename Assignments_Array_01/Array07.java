package Assignments_Array_01;

import java.util.Scanner;
//Write a program to create an array of ‘n’ integer elements.
//Where ‘n’ value should be taken from the user.
//Insert the values from users and find the sum of all elements in the array.
public class Array07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size -> ");
        int num=sc.nextInt();
        int []arr=new int[num];
        System.out.println("Enter the Arrays Elements -> ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array is -> "+sum);
    }
}
