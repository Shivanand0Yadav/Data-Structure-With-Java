// Take a square matrix of size n*n as input, and rotate the matrix by 90 degree.
// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question .
// Question Link -> https://practice.geeksforgeeks.org/problems/rotate-by-90-degree0356/1
import java.io.*;
import java.util.*;

public class RotateTheMatrixBy90Degree {
static void transpose(int[][] arr, int n){
        for(int i=0;i<n;i++){    
            for(int j=0;j<n;j++){ 
                if(i<=j){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                }
            }    
        }   
    }
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
        transpose(arr,n);
        reverse(arr,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}