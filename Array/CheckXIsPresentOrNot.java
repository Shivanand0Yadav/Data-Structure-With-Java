import java.io.*;
import java.util.*;

public class CheckXIsPresentOrNot {
    public static boolean isPresent(int[] arr, int data){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        System.out.println("Enter the element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element for checking in array");
        int z=sc.nextInt();
        boolean ans=isPresent(arr,z);
        if(ans){
            System.out.println("True");
        }else
            System.out.println("False");
    }
}