package Day03_TimeComplexity;

import java.util.Scanner;

public class SumOFNaturalNumbers_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result = SumOfNatralNumber(num);
        System.out.println("Total Sum Of Numbers -> "+result);
    }
    //in this Problem We're trying a BrutForce Approach
    private static int SumOfNatralNumber(int num) {
        int sum = 0;
        int itr = 0;
        for(int i = 1; i <= num; i++) {
            itr++;
            sum += i;
        }
        System.out.println("Iteration -> "+itr );
        return sum;
    }
}
