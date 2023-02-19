// Take an array of size N as input, representing a 1-D array.
// There are many possible factors of N, for eg:- p * q = N.
// Now take p and q as input and print the 2-D array with dimensions as p*q.
// Note: It is guaranteed that a 2-D array will be formed
// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question .
//  Question Link -> https://leetcode.com/problems/convert-1d-array-into-2d-array
import java.io.*;
import java.util.*;

public class Convert1DArrayTo2DArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr1=new int[n][m];
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=arr[l];
                l++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}