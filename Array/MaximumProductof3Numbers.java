// Take an integer array of size N as input and print the maximum product of three numbers.

import java.io.*;
import java.util.*;

public class MaximumProductof3Numbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Arrays.sort(arr);
        for(int i=1;i<n;i++){
            int j=i-1;
            int val =arr[i];
            while(j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
        int res=arr[0]*arr[1]*arr[n-1];
        int res1=arr[n-3]*arr[n-2]*arr[n-1];
        System.out.println(Math.max(res,res1));
    }
}