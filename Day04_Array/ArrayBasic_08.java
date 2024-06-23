package Day04_Array;

import java.util.Scanner;

public class ArrayBasic_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     additionOfPairs(arr,n);
    }

    private static void additionOfPairs(int[] arr, int n) {
        int sum=0;
        for(int i=0;i<arr.length/2;i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                sum=arr[i] + arr[j - i];
                break;
            }
            System.out.println(sum);
        }
    }
}
