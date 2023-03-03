// Take a String str as input and print the sum of all substrings of a string representing a number.
import java.io.*;
import java.util.*;

public class SumofAllSubstrings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ss=s.substring(i,j+1);
                int k=Integer.parseInt(ss);
                sum+=k;
            }
        }
        System.out.println(sum);
    }
}