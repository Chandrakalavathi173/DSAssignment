import java.util.Scanner;
public class MissingNumbers {
    public void missingNumbers(int[] arr,int N){
        System.out.println("Missing elements:");
        int min=arr[0];
        int max=arr[N-1];
        int[] isPresent=new int[max-min+1];
        for(int i:arr){
            isPresent[i-min]=1;
        }
        int miss_count=0;
        for(int i=0;i<isPresent.length;i++){
            if(isPresent[i]==0){
                miss_count++;
            }
        }
        int[] miss_Numbers=new int[miss_count];
        int index=0;
        for(int i=0;i<isPresent.length;i++){
            if(isPresent[i]==0){
                miss_Numbers[index++]=i+1;
            }
        }
        for(int i=0;i<miss_Numbers.length;i++){
            System.out.println(miss_Numbers[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MissingNumbers mn=new MissingNumbers();
        System.out.println("Enter size");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter elements");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        mn.missingNumbers(arr,N);
    }
}
