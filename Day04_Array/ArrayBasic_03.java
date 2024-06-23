package Day04_Array;

import java.util.Scanner;
import static java.lang.Integer.MIN_VALUE;


//this is Optimized Approach of Solving
public class ArrayBasic_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result=findCountMaxElement( arr,n);
        System.out.println("Total No Greatest Elements Of Itself -> "+result);
    }
    private static int findCountMaxElement(int[] arr, int n) {
        int maxElement=MIN_VALUE;
        int count=0;

        //here we are finding a MAX Element
        for(int i=0; i<n; i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }

        //in this loop we just substrating maxElement into n
        //so we gor our output
        for(int i=0;i<n;i++){
            if(maxElement==arr[i]){
                count++;
            }
        }
        return n-count;
    }
}
//T.C == O(n)
//S.C == O(1)
