// Given two sorted arrays A[] and B[] of size N and M. 
// The task is to merge both the arrays into a single array in non-decreasing order.

import java.io.*;
import java.util.*;

public class Mergetwosortedarrays6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] B=new int[m];
        for(int i=0;i<m;i++){
            B[i]=sc.nextInt();
        }
        int[] sol=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(A[i]<B[j]){
                sol[k]=A[i];
                i++;
                k++;
            }else{
                sol[k]=B[j];
                j++;
                k++;
            }
        }
            while(i<n){
                sol[k]=A[i];
                i++;
                k++;
            }
            while(j<m){
                sol[k]=B[j];
                j++;
                k++;
            }
        for(int l=0;l<n+m;l++){
            System.out.print(sol[l]+" ");
        }
    }
}