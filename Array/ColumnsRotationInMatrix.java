// Given a matrix of n*n matrix. Check if all the columns of matrix are rotated permutation of each other or not. For Ex: 1-2-3-4-5
// 4-5-1-2-3  is rotation of the above
// but 5-4-1-2-3 is not.
import java.io.*;
import java.util.*;

public class ColumnsRotationInMatrix {
    static boolean isRotated(int[][] arr,String ss){
        int v=arr.length;
        for(int i=0;i<arr.length;i++){
            String k="";
            for(int j=0;j<arr[0].length;j++){
                k+=arr[j][i];
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
            s+=arr[i][0];
        }
        String ss=s+s;
        System.out.println(isRotated(arr,ss));
    }
}