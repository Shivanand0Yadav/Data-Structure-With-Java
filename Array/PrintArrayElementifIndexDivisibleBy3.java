//if index is divisible by 3 the print the element
import java.io.*;
import java.util.*;

public class PrintArrayElementifIndexDivisibleBy3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        System.out.println("Enter the  element");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your Output");
        for(int i=0;i<n;i++){
            if(i%3==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}