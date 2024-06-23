package Day04_Array;

import java.util.Scanner;

public class ArrayBasic_05
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result=find_Pair( arr,n);
        System.out.println("Total No Pair -> "+result);
    }

    private static int find_Pair(int[] arr, int n) {
        int sum=10;
        int count=0;
        int itr=0;
        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                itr++;
                if(arr[i]+arr[j]==sum && i!=j){
                    count++;
                }
            }
        }
        System.out.println(itr);
    return count*2;
    }
}
