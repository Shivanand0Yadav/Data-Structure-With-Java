// Given an array arr of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
//  Return the largest lucky integer in the array. If there is no lucky integer return -1.

import java.io.*;
import java.util.*;

public class HW_LuckyNumber26 {
    static int freq(int[] arr,int[] freq){
        int max=-1;
        int num=0;
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            if(freq[k]>max && freq[k]==arr[i]){
                max=freq[k];
                num=arr[i];
            }
        }
        if(num==0){
            return -1;
        }else 
            return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] freq=new int[9];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            freq[arr[i]]++;
        }
        
        System.out.println(freq(arr,freq));
    }
}