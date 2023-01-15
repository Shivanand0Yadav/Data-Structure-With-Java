import java.io.*;
import java.util.*;

public class PrintPrimeNumbersInArray {
    public static boolean isPrime(int arr){
        for(int i=2;i<arr;i++){
            if(arr%i==0)
                return false;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}