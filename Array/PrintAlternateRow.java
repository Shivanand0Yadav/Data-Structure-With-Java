// You are given a 2D matrix , your task is print the alternate rows of the matrix starting from the 0th row.

import java.io.*;
import java.util.*;

public class PrintAlternateRow {

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
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");
                    
                }
                
            }
            if(i%2==0)
                System.out.println();
        }
        
    }
}