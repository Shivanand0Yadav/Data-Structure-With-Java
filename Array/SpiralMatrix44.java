// Print all the elements of a m*n matrix in the spiral form as shown below. Note: Start traversing from the – (0th row and 0th column)
// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question .
//  Question Link -> https://leetcode.com/problems/spiral-matrix
import java.io.*;
import java.util.*;

public class SpiralMatrix44 {

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
        int t=0,b=m-1,l=n-1,r=0;
        int dir=0;
        int res=m*n;
        while(dir<res){
            for(int i=r;i<=l&& dir<res;i++){
                System.out.print(arr[t][i]+"   ");
                dir++;
            }
            t++;
            for(int i=t;i<=b&& dir<res;i++){
                System.out.print(arr[i][l]+"   ");
                dir++;
            }
            l--;
           for(int i=l;i>=r&& dir<res;i--){
                System.out.print(arr[b][i]+"   ");
               dir++;
            }
            b--;
            for(int i=b;i>=t&& dir<res;i--){
                System.out.print(arr[i][r]+"   ");
                dir++;
            }
            r++;
        }
    }
}