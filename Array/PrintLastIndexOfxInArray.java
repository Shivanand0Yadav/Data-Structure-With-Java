import java.io.*;
import java.util.*;

public class PrintLastIndexOfxInArray {
    public static int lastIndex(int[] arr,int key){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==key){
                return i;
            }}
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int lm=lastIndex(arr,key);
        System.out.println(lm);
    }
}