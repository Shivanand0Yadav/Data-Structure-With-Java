//Given an array having n elements consisting of only 0s and 1s. Sort the array in O(N) time complexity.

import java.io.*;
import java.util.*;

public class ZeroesandOnes {
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
        while(i<n){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}