package Day03_TimeComplexity;

import java.util.Scanner;

public class SumOFNaturalNumbers_2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result = SumOfNatralNumber(num);
        System.out.println("Total Sum Of Numbers -> "+result);
    }
    //this is Optimized Approach here we Used to O(1)
    //there in Constant time we Used
    private static int SumOfNatralNumber(int num) {
          int itr=0;
          int sum=(num * (num+1))/2;
          System.out.println("Iteration -> "+itr);
          return sum;
    }
}
