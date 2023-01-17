import java.io.*;
import java.util.*;

public class PrintSumofElementsExceptItself {
    public static int sunOfArr(int[] arr,int j){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum-arr[j];
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }for(int i=0;i<n;i++){
        int ans=sunOfArr(arr,i);
        System.out.println(ans);
        }
    }
}