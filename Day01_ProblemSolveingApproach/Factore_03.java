package Day01_ProblemSolveingApproach;

import java.util.Scanner;

public class Factore_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=in.nextInt();
        int result=findFactore(num);
        System.out.println("Factors of "+num+" are : "+result);
    }
    //this is Optimized Approach and Here
    //we Cover's All corner Cases.
    private static int findFactore(int num) {
        int count=0;
        int itr=0;
        for(int i=1;i*i<=num;i++) {
            itr++;
            if(num%i==0) {
                if(i==num/i){
                    count+=1;
                }else {
                    count+=2;
                }
            }
        }
        System.out.println("Iteration -> "+itr);
        return count;
    }
}
