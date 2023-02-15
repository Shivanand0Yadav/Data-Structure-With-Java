// Print the matrix row wise such that the even row is traversed from left to right and odd row is traversed from right to left.

import java.io.*;
import java.util.*;

public class HW_PrintRowWiseWithCondition {

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
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else
                for(int j=m-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            System.out.println();
        }
    }
}