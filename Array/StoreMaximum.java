import java.io.*;
import java.util.*;

public class StoreMaximum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int lMax=arr[i];
            for(int j=i;j>=0;j--){
                if(arr[j]>lMax){
                    lMax=arr[j];
                }
            }
            int rMax=arr[i];
            for(int j=i;j<n;j++){
                if(arr[j]>rMax){
                    rMax=arr[j];
                }
            }
            ans+=Math.min(lMax,rMax)-arr[i];
        }
        System.out.println(ans);
    }
}