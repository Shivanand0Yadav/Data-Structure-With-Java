// Take the target as an integer input.
// Then print the indices of the two numbers such that they add to the target.
// Note that the array is not sorted here. Two pionter, answer must be unique.

import java.io.*;
import java.util.*;

public class ReachTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]+arr[j]==k&& j!=i){
                    System.out.println(i+" "+j);
                }
            }
        }
        
    }
}