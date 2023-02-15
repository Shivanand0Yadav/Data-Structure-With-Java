import java.io.*;
import java.util.*;

public class HW_PrintLowerTriangularMatrix {
    static void upperTriang(int[][] arr,int i,int j){
        while(i<j){
            arr[i][j]=0;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                upperTriang(arr,i,j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    } 
}