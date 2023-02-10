// Print the matrix column wise such that we print the alternate columns of the matrix starting from the first column.

import java.io.*;
import java.util.*;

public class PrintAlternateColumnwise {

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
        for(int j=0;j<m;j+=2){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}