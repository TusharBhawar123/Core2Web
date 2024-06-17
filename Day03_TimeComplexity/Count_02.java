package Day03_TimeComplexity;

import java.util.Scanner;

public class Count_02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Start: ");
        int Start = sc.nextInt();
        System.out.println("Enter the number of End: ");
        int End = sc.nextInt();
        int result = findCount(Start,End);
        System.out.println("Total Sum Of Numbers -> "+result);
    }
    //this is Optimized Approach here we Used to O(1)
    //there in Constant time we Used
    private static int findCount(int start, int end) {
         return end-start+1;
    }
}
