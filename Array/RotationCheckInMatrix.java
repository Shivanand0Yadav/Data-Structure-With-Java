// Check whether all rows of a matrix are circular rotations of each other.
// Given a matrix of n*n size, the task is to find whether all rows are circular rotations of each other or not.

import java.io.*;
import java.util.*;

public class RotationCheckInMatrix {
    static boolean isRotated(int[][] arr,String ss){
        int v=arr.length;
        for(int i=0;i<arr.length;i++){
            String k="";
            for(int j=0;j<arr[0].length;j++){
                k+=arr[i][j];
            }
            if(!ss.contains(k)){
                return false;
            }
            
            
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        String s="";
        for(int i=0;i<n;i++){
            s+=arr[0][i];
        }
        String ss=s+s;
        if(isRotated(arr,ss)){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}