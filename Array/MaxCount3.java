import java.io.*;
import java.util.*;

public class MaxCount3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max_fr=0;
        int fr=0;
        for(int i=0;i<n;i++){
            int curr_val=arr[i];
            int curfer=0;
            for(int j=0;j<n;j++){
                if(arr[j]==curr_val){
                    curfer++;
                }
            }
            if(curfer>max_fr){
                fr=curr_val;
                max_fr=curfer;
            }
        }System.out.println(fr);
    }
}