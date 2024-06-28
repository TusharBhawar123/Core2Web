package Assignments_Array_01;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size -> ");
        int num=sc.nextInt();
        int []arr=new int[num];
        System.out.println("Enter the Arrays Elements -> ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("---------------------------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.println(i+" index of -> "+arr[i]);
        }
    }
}
