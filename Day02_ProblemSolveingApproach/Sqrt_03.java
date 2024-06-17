package Day02_ProblemSolveingApproach;

import java.util.Scanner;

public class Sqrt_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int result=findSqrt(num);
        System.out.println("SquareRoot of "+num+" are : "+result);
    }

    private static int findSqrt(int num) {
        int start=0;
        int end=num;
        int ans=0;
        int itr=0;
        while(start<=end){
            int mid=(start+end)/2;
            int sqrt=mid*mid;
            itr++;
            if(sqrt==num){
                return mid;
            }
            if(sqrt>num){
                end=mid-1;
            }else{
                ans=mid;
                start=mid+1;
            }
        }
        System.out.println("Iteration -> "+itr);
        return ans;
    }
}
