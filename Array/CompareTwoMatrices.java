// You have to take two matrices as input.
// First Matrix of size m1*n1.
// Second Matrix of size m2*n2.
// Compare the two matrices and 
// print "Same" if both the matrices are same else print "Not Same".import java.io.*;
import java.util.*;

public class CompareTwoMatrices {
    static boolean comparator(int arr[][],int arr1[][]){
        if(arr.length!=arr1.length || arr[0].length!=arr1[0].length){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=arr1[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int[][] arr1=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        if(comparator(arr,arr1)){
            System.out.print("Same");
        }else
            System.out.print("Not Same");
    }
}