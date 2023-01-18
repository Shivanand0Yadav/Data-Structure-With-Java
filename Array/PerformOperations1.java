import java.io.*;
import java.util.*;

public class PerformOperations1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr[i]+=1;
            }else if(arr[i]==0){
                arr[i]+=2;
            }else if(arr[i]<0){
                arr[i]+=3;
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}