// You have to take two matrices as input.
// First Matrix of size m1*n1.
// Second Matrix of size m2*n2.
// Print a matrix after addition of given matrices.
// Note: Two Matrices can only be added only if m1=m2 and n1=n2.
// Print -1 if addition is not possible.import java.io.*;
import java.util.*;

public class HW_AddTwoMatrices {
    static int[][] add(int A[][], int B[][],int m1,int n1){
        int i, j;
        int C[][] = new int[m1][n1];
        for (i = 0; i < m1; i++)
            for (j = 0; j < n1; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }
    static void printmat(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

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
        }if(m1==m2 && n1==n2){
            int[][] ans=add(arr1,arr2,m1,n1);
            printmat(ans);
        }else{
            System.out.println(-1);
        }
    }
}