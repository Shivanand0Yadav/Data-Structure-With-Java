// You are given a matrix of char And a string(word) You have to check is the word present in matrix or not Word can be in any of the Following Directions:
// a.The word can be Horizontal --- From left to right. 
// b.The word can be Vertical – From Top to bottom.
// c.Word can be along any Diagonal
import java.io.*;
import java.util.*;

public class CrossWord2 {
    public static boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;
 
    boolean result = false;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
           if(dfs(board,word,i,j,0)){
               result = true;
           }
        }
    }
 
    return result;
    }
 
    public static boolean dfs(char[][] board, String word, int i, int j, int k){
        int m = board.length;
        int n = board[0].length;
        if(i<0 || j<0 || i>=m || j>=n){
             return false;
         }
 
        if(board[i][j] == word.charAt(k)){
            char temp = board[i][j];
            if(k==word.length()-1){
             return true;
            }else if(dfs(board, word, i+1, j, k+1)||dfs(board, word, i, j+1, k+1)||dfs(board,word,i+1,j+1,k+1)||dfs(board,word,i-1,j-1,k+1)){
            return true;
        }
        board[i][j]=temp;
    }
 
    return false;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char arr[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        String s=sc.next();
        System.out.println(exist(arr,s));
    }
}