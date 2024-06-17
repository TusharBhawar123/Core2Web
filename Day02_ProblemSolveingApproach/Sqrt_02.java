package Day02_ProblemSolveingApproach;

import java.util.Scanner;

public class Sqrt_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int result=findSqrt(num);
          System.out.println("SquareRoot of "+num+" are : "+result);
    }
//    here we Are Using BrutForce Approach
//    there a one Corner_Case
//    Corner_Case : There are all perfect Square then Only then we Get
//                  correct Answer.
//    but Suppose Number is Random Natural Number Then
//    this Program O/P is 0 (anda).
//    ex:- num=50;
//    in this fun we Handel this corner_Case

    //and this is Optimized Approach Also
    private static int findSqrt(int num) {
        int sqrt=0;
        int itr=0;
        for(int i=1;i*i<=num;i++){
            itr++;
            sqrt=i;
        }
        System.out.println("Iteration -> "+itr);
        return sqrt;
    }
}
