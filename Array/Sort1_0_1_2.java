import java.io.*;
import java.util.*;

public class Sort1_0_1_2 {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=n-1;
        while(i<=k){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[i]==1){
                i++;
            }else{
                swap(arr,i,k);
                k--;
            }
        }
        for(int l=0;l<n;l++){
            System.out.print(arr[l]+" ");
        }
    }
}