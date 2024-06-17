package Day01_ProblemSolveingApproach;

import java.util.Scanner;

public class Factore_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int result=findFactore(num);
        System.out.println("Factors of "+num+" are : "+result);
    }
//in this Approach we can This is BrutForce Approach
    //there is Some Corner Cases also
    private static int findFactore(int num) {
        int count=0;
        int itr=0;
        for(int i=1;i<=num;i++) {
            itr++;
            if(num%i==0) {
                count++;
            }
        }
        System.out.println("Iteration -> "+itr);
        return count;
    }
}
