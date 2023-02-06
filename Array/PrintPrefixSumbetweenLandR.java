// Take an integer input l and r such that l,r<=array.length. Given an array. Make a prefix sum array from this. 
// The print the sum of the elements inside the array starting from the l-index till the r-index(l and r both inclusive)import java.io.*;
import java.util.*;

public class PrintPrefixSumbetweenLandR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=x;i<=y;i++){
            System.out.println(arr[i]);
        }
    }
}