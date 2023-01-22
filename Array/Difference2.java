import java.io.*;
import java.util.*;

public class Difference2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n-k;i++){
            if(Math.abs(arr[i]-arr[i+k])==k){
            System.out.println(arr[i]+" "+arr[i+k]);    
            }
        }
    }
}