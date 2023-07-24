import java.util.Arrays;
import java.util.Scanner;
public class SingularCount {
    public void singleCount(int[] arr){
        int[] count=new int[10];
        //sorting the array
        Arrays.sort(arr);
        for(int id:arr){
            count[id/10-1]++;
        }
        int singlecount=0;
        for(int i=0;i<count.length;i++){
            if(count[i]%2!=0)
            {
                singlecount++;
            }
        }
        //total singlecount
        System.out.println(singlecount);
        
    }
    public static void main(String[] args){
        SingularCount scount=new SingularCount();
        Scanner sc=new Scanner(System.in);
        //Enter size of array
        int N=sc.nextInt();
        int[] arr=new int[N];
        //Enter elements
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        scount.singleCount(arr);

        
    }
}
