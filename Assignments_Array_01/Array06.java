package Assignments_Array_01;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.min;

//Write a program to create an array of ‘n’ integer elements.
//Where ‘n’ value should be taken from the user.
//Insert the values from users and find the min number from the array
public class Array06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size -> ");
        int num=sc.nextInt();
        int []arr=new int[num];
        System.out.println("Enter the Arrays Elements -> ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int minEle=MAX_VALUE;
        for(int  i=0;i<arr.length;i++){
            if(minEle>arr[i]){
                minEle=arr[i];
            }
        }
        System.out.println("Min Element is -> "+minEle);
    }
}
