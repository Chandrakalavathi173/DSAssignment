import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int sum_count = 0;
        for(int i = 0;i<n;i++){
            int total = arr[i];
            if (total < 0){
                sum_count += 1;
            }
            for(int j = i+1;j<n;j++){
                total += arr[j];
                if (total < 0){
                    sum_count += 1;
                }
            }
        }
        System.out.println(sum_count);
    }
}
