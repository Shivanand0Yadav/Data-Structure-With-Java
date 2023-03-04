// Given a string, we have to find out all subsequences of it.
import java.io.*;
import java.util.*;

public class SubsequenceofString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int total=(int) Math.pow(2,str.length());
        for(int i=total-1;i>=0;i--){
            int temp=i;
            String s="";
            for(int j=str.length()-1;j>=0;j--){
                int rem=temp%2;
                temp/=2;
                if(rem==1){
                    s=str.charAt(j)+s;
                }
            }
            System.out.print(s+" ");
        }
        
    }
}