package Day05_Array_PrefixSum;

import java.util.Scanner;

public class PrefixSumArray02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of Array -> ");
        int n = sc.nextInt();
        System.out.println("Enter the Arrays Elements -> ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findRangeSum(arr, n);
    }
    public static void findRangeSum(int[] arr, int n) {
        arr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        int sum = 0;
        int Q = 3;
        for (int i = 0; i < Q; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Starting Point ->");
            int startingIdx = sc.nextInt();
            System.out.println("Enter the Ending Point ->");
            int endingIdx = sc.nextInt();
            if(startingIdx==0){
                sum=arr[endingIdx];
            }else {
                sum = arr[endingIdx] - arr[startingIdx - 1];
            }
            System.out.println(arr[startingIdx]+" + "+arr[endingIdx]+" = "+sum);
        }
    }
}
//T.C == O(n)
//S.C == O(1)
