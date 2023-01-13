import java.io.*;
import java.util.*;

public class CheckIfTwoArraysAreIdentical1 {
    public static boolean isIdentical(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element of first array");
        int n=sc.nextInt();
        System.out.println("Enter the  element");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the number of element of second array");
        int m=sc.nextInt();
        System.out.println("Enter the  element");
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        boolean ans=isIdentical(arr1,arr2);
        System.out.println(ans);
    }
}