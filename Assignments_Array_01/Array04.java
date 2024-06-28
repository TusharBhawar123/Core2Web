package Assignments_Array_01;

import java.util.Scanner;

//Write a program to create an array of ‘n’ integer elements.
//Where ‘n’ value should be taken from the user.
//Insert the values from users and print even numbers from the array.
public class Array04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size -> ");
        int num=sc.nextInt();
        int []arr=new int[num];
        System.out.println("Enter the Arrays Elements -> ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("-------------------------------------------");
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("Elements are Even -> "+arr[i]);
            }
        }
    }
}
