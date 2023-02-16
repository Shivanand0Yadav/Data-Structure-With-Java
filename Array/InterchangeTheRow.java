// Interchange elements of the first and last row of a matrix.

import java.io.*;
import java.util.*;

public class InterchangeTheRow {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<m;i++){
            
            int temp=arr[0][i];
            arr[0][i]=arr[n-1][i];
            arr[n-1][i]=temp;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}