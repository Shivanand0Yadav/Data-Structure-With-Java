// Given a m*n matrix and you are also given an integer x. Each row and column of the matrix is sorted in increasing order. 
// You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below. In case an element is not found, print "Not Found".
// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/search-a-2d-matrix
import java.io.*;
import java.util.*;

public class SearchInASortedMatrix {
    static void find(int[][] A,int x){
        int r=A.length;
        int c=A[0].length;
        int l=0;
        int m=c-1;
        while(l<r && m>=0){
            if(A[l][m]==x){
                System.out.println(l);
                System.out.println(m);
                return;
            }else if(x>A[l][m]){
                l++;
            }else{
                m--;
            }
        }
        System.out.println("Not Found");
    }
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
        int k=sc.nextInt();
        find(arr,k);
    }
}