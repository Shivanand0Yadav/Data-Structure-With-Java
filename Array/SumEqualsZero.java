import java.io.*;
import java.util.*;

public class SumEqualsZero {
    static boolean ret(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];

                }
                if(sum==0){
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ret(arr,n));
    }
}