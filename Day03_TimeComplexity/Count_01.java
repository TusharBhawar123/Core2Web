package Day03_TimeComplexity;

import java.util.Scanner;

public class Count_01 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Start: ");
        int Start = sc.nextInt();
        System.out.println("Enter the number of End: ");
        int End = sc.nextInt();
        int result = findCount(Start,End);
        System.out.println("Total Sum Of Numbers -> "+result);
    }
//in this Problem We're trying a BrutForce Approach
    private static int findCount(int Start,int End) {
          int count=0;
          int itr=0;
          for(int i=Start;i<=End;i++){
              itr++;
              count++;
          }
          System.out.println("Iteration -> "+itr);
          return count;
    }
}
