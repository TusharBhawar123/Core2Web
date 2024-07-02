package Day05_Array_PrefixSum;

import java.util.Scanner;

public class RangeSum_Quaries {
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
        Scanner sc = new Scanner(System.in);
        int Q = 3;     //here Q is not supposed to constant its depend Upon User
        for (int i = 0; i < Q; i++) {
            System.out.println("Enter the Starting Point ->");
            int startingIdx = sc.nextInt();
            System.out.println("Enter the Ending Point ->");
            int endingIdx = sc.nextInt();
            int sum = 0;
            for (int j = startingIdx; j <= endingIdx; j++) {
                sum += arr[j];
            }
            System.out.println("StartingIndex -> "+startingIdx+" + Ending_index -> "+endingIdx+" = "+sum);
        }
    }
}
//T.C == O(q*n)
//S.C == O(1)