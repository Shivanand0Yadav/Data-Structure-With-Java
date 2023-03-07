// 
import java.io.*;
import java.util.*;

public class MergeStringsAlternatively {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s="";
        int n=Math.max(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            s+=s1.charAt(i);
            s+=s2.charAt(i);
        }
        System.out.println(s);
    }
}