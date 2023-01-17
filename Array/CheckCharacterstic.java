import java.io.*;
import java.util.*;

public class CheckCharacterstic {
    public static int isTypeNum(int[] arr,int i){
       
           if(arr[i]>0){
               return 1;
           }else if(arr[i]<0){
               return -1;
           }else
               return 0;
       
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(isTypeNum(arr,i)+" ");
        }
    }
}