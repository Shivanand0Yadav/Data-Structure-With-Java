import java.io.*;
import java.util.*;

public class ReversePair {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}