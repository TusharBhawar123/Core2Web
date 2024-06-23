package Day04_Array;

import java.util.Scanner;

public class ArrayBasic_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr,n);
    }

    private static void reverseArray(int[] arr, int n) {
        int i=0;
        int j=n-1;
        int temp=0;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
