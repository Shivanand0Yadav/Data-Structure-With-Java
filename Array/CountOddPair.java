import java.io.*;
import java.util.*;

public class CountOddPair {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((arr[i]+arr[j])%2!=0){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}