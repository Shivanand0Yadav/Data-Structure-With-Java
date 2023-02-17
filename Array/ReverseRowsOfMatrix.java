// Given a n*n matrix, reverse each row of the matrix, without taking any extra space and making the changes within the matrix.
// Print the final matrix such that all elements of the row are tab separated and are in one line.

import java.io.*;
import java.util.*;

public class ReverseRowsOfMatrix {
    static void reverse(int[][] arr,int n){
        for(int row =0;row<n;row++){
            int i=0;
            int j=n-1;
            while(i<j){
                int temp=arr[row][i];
                arr[row][i]=arr[row][j];
                arr[row][j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        reverse(arr,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}