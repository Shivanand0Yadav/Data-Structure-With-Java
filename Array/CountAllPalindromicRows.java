// Take a 2-D array of size m*n as input and count the number of Palindromic Rows present in the 2-D array.import java.io.*;
import java.util.*;

public class CountAllPalindromicRows {
    static boolean isPalindrome(int[][] A,int k){
            int i=0;
            int j=A[0].length-1;
            while(i<j){
                if(A[k][i]!=A[k][j]){
                    return false;
                }
                i++;
                j--;
            }
        return true;
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
        int count=0;
        for(int i=0;i<m;i++){
            if(isPalindrome(arr,i)){
                count++;
            }
        }
        System.out.println(count);
    }
}