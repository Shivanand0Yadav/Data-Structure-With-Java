//give two array and find the non matching index possion
import java.io.*;
import java.util.*;

public class PrintFirstNonMatchingNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of both array");
        int n=sc.nextInt();
        System.out.println("Enter the element");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Your output");
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr[i]){
                System.out.println(i);
                break;
            }
        }
        
    }
}