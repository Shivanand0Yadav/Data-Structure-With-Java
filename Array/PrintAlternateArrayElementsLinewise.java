import java.io.*;
import java.util.*;

public class PrintAlternateArrayElementsLinewise {

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
        for(int i=0;i<n;i+=2){
            System.out.println(arr[i]);
            
        }
    }
}
