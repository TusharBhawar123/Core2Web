package Assignments_Array_01;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

//Write a program to create an array of ‘n’ integer elements.
//Where ‘n’ value should be taken from the user.
//Insert the values from users and find the max number from the array
public class Array05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size -> ");
        int num=sc.nextInt();
        int []arr=new int[num];
        System.out.println("Enter the Arrays Elements -> ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int maxEle=MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(maxEle<arr[i]){
                maxEle=arr[i];
            }
        }
        System.out.println("Max Element is -> "+maxEle);
    }
}
