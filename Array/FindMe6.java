// Given an array of size n with unique integer elements. And then take m as an integer input. 
// Declare the second array of size m that stores values of int data-type. 
// Then take m integer inputs and store them in the array one by one.
// Then print all the elements of the first array whose absolute values are present in the second array.
//  You shouldn’t use any extra space.
import java.io.*;
import java.util.*;

public class FindMe6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] arr2=new int[k];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(Math.abs(arr1[i])==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
         }
        }
    }
}