// Two friends Ankit and Deepanshu are having two matrices of size m1*n1 and m2*n2 respectively. 
// Both of them are good at mathematics and they wondering how we can multiply the matrices.
// Your task is to help both of them in multiplication of matrices.
// Print the final matrix after the multiplication.
// Print "-1" if the multiplication is not possible.
// Note: Multiplication of two matrices is only possible when n1==m2.
import java.io.*;
import java.util.*;

public class MultiplicationofTwoMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int[][] arr1=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        int[][] arr2=new int[m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int i,j,k,sum;
        if(m1==n2){
            int A[][]=new int[m1][n2];
            for ( i= 0 ; i <m1 ; i++ )
                for ( j= 0 ; j <n2;j++){
                    sum=0;
                    for ( k= 0 ; k <m2;k++ ){
                        sum +=arr1[i][k]*arr2[k][j];
                    }
                    A[i][j]=sum;
                }
            for ( i= 0 ; i < m1; i++ ){
                for ( j=0 ; j < n2;j++ )
                    System.out.print(A[i][j]+" ");
                System.out.println();
            }
        }
        else
            System.out.print("-1");
    }
}