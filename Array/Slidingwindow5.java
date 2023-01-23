import java.io.*;
import java.util.*;

public class Slidingwindow5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<=n-k;i++){
            int max=arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j]>max){
                    max=arr[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
}