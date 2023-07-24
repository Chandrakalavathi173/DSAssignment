import java.util.Scanner;

public class CummulativeMultiple {
    public void cummulativeMultiple(int[] arr){
        int[] res=new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i]=1;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                res[i]=res[i]*arr[j];
            }
        }
        // System.out.println("Result:");
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static void main(String[] args) {
        CummulativeMultiple cm=new CummulativeMultiple();
        Scanner sc=new Scanner(System.in);
        try{
            // System.out.println("Enter the size:");
            int N=sc.nextInt();
            int[] arr=new int[N];
            // System.out.println("Enter elements:");
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            sc.close();
            cm.cummulativeMultiple(arr);
        }
        catch(Exception e){
            System.out.println("Invalid inputs!!");
        }

    }
}
