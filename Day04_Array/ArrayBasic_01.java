package Day04_Array;

public class ArrayBasic_01 {
    public static void main(String[] args) {
        int [] arr=new int[]{5,6,2,3,1,9};
        int n=6;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
//T.C ==O(n);
//S.C ==O(1);