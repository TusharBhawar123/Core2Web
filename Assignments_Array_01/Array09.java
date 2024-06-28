package Assignments_Array_01;

import java.util.Scanner;

public class Array09 {
     public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int digitSum = 0;
        while (num > 0) {
            int digit = num % 10;
            digitSum += factorial(digit);
            num /= 10;
        }
        return digitSum == originalNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size -> ");
        int num=sc.nextInt();
        int [] arr=new int[num];
        System.out.println("Enter the Arrays Elements -> ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Integer strongestNumber = null;
        for (int num1 : arr) {
            if (isStrongNumber(num1)) {
                if (strongestNumber == null || num1 > strongestNumber) {
                    strongestNumber = num1;
                }
            }
        }
        // Output the strongest number found
        if (strongestNumber != null) {
            System.out.println("The strongest number in the array is: " + strongestNumber);
        } else {
            System.out.println("No strong number found in the array.");
        }

    }
    // Function to calculate factorial of a number

}
