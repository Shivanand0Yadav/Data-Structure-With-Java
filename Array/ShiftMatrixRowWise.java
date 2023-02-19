// // Given a n*n matrix and an integer k. Shift the matrix elements row-wise by k. Print the final matrix such that 
// all elements of the row in one line.
import java.io.*;
import java.util.*;

public class ShiftMatrixRowWise {
    static void reverse(int arr[][],int i,int j,int row){
        while(i<j){
            int temp=arr[row][i];
            arr[row][i]=arr[row][j];
            arr[row][j]=temp;
            i++;
            j--;
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
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            reverse(arr,0,k-1,i);
            reverse(arr,k,n-1,i);
            reverse(arr,0,n-1,i);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}