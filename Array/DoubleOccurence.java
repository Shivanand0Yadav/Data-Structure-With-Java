// Given an array of size n with unique integer elements. And then take m as an integer input.
// Declare the second array of size m that stores values of int data-type. Then take m integer inputs
// and store them in the array one by one.
// Then print all the elements of the first array which occur exactly twice in the second array.
import java.io.*;
import java.util.*;

public class DoubleOccurence {

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
          int num=0;
            for(int j=0;j<m;j++){
                if(arr[i]==arr1[j]){
                    num++;
                }
            }
            if(num==2){
                System.out.print(arr[i]+ " ");
                
            }
        }
    }
}