//Given an array then for each index print the count of the elements
// which are strictly greater than the element present at that index.import java.io.*;
import java.util.*;

public class GreaterThanMe {
    public static int greaterThanMe(int[] arr ,int me){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>me){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(greaterThanMe(arr,arr[i])+" ");
        }
    }
}