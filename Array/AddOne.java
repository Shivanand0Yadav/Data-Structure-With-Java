import java.io.*;
import java.util.*;

public class AddOne {
    public static void printArr(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] addOne(int [] arr){
        for(int i  = arr.length-1; i >= 0; i--){
            if(arr[i] != 9 ){
                arr[i]++;
                break;
            }
            else{
                arr[i] = 0;
            }
        }
        if(arr[0] == 0){
            int [] ans = new int[arr.length+1];
            ans[0] = 1;
            return ans;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = scn.nextInt();
        System.out.println("Enter the element");
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int [] ans = addOne(arr);
        System.out.println("Your Output");
        printArr(ans);
        
    }
}