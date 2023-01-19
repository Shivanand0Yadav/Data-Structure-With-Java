import java.io.*;
import java.util.*;

public class PrintPair {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            
            for(int j=i+1;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}