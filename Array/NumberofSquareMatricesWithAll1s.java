// Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question .
// Question Link -> https://leetcode.com/problems/count-square-submatrices-with-all-ones
import java.io.*;
import java.util.*;

public class NumberofSquareMatricesWithAll1s {
    public static int countSquares(int[][] matrix) {
    int ans = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] > 0 && i > 0 && j > 0) {
          matrix[i][j] = Math.min(matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1])) + 1;
        }
        ans += matrix[i][j];
      }
    }
    return ans;
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
        System.out.println(countSquares(arr));
    }
}