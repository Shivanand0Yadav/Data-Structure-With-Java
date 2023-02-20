// Given a boolean matrix mat[M][N] of size M X N, 
// modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.import java.io.*;
import java.util.*;

public class ModifyTheMatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] r=new int[row];
        int[] c=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(r[i]==1|| c[j]==1){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}