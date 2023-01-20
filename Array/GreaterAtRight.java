//Given an array, for each index, 
//replace the element with the count of greater elements present to the right of that element.import java.io.*;
import java.util.*;

public class GreaterAtRight {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}