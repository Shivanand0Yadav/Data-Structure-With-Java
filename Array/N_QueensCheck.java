// Given a n*n chess board that contains 0 and 1. 0 means there is nothing at that place. 1 means there is a queen at that place. 
// Print “N Queens” if no queen attacks the other queen, otherwise print “Danger”.
import java.io.*;
import java.util.*;

public class N_QueensCheck {
    static boolean isCheck(int[][] A,int i,int j){
        for(int c=j-1;c>=0;c--){
            if(A[i][c]==1){
                return true;
            }
        }
        for(int r=i-1,c=j-1;r>=0 && c>=0;r--,c--){
            if(A[r][c]==1){
                return true;
            }
        }
        for(int r=i-1,c=j;r>=0 ;r--){
            if(A[r][c]==1){
                return true;
            }
        }
        for(int r=i-1,c=j+1;r>=0 && c<A.length;r--,c++){
            if(A[r][c]==1){
                return true;
            }
        }
        // for(int r=i,c=j+1;c<A.length;c++){
        //     if(A[r][c]==1){
        //         return true;
        //     }
        // }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean den=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    if(isCheck(arr,i,j)==true){
                        den=true;
                        break;
                    }
                }
            }
        }
        if(den==true){
            System.out.println("Danger");
            }else{
            System.out.println("N Queens");
        }
    }
}