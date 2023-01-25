// Given an array of size n with unique integer elements. And Then take m as an integer input.
// Declare the second array of size m that stores values of int data-type. Then take m integer inputs and 
// store them in the array one by one.
// Then print all the unique elements of the first array whose additive inverses are present in the second 
// array.
// Note: The additive inverse of a number is a value that gives a net outcome of zero when added to the original number.import java.io.*;
import java.util.*;

public class MirrorImage4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int [] arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i]+arr1[j]==0){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}