// find the index of given element
import java.io.*;
import java.util.*;

public class PrintFirstIndexOfxInArray {
    public static int isPresent(int arr[],int data){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data)
                return i;
        }
        return -1;
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
        System.out.println("Enter the element  present in array for find the index");
        int r=sc.nextInt();
        int z=isPresent(arr,r);
        System.out.println(z);
    }
}