// Given a string. Generate all rotations of a string.import java.io.*;
import java.util.*;

public class GenerateRotation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=0;i<n;i++){
            String ans="";
            for(int j=n-i;j<n;j++){
                ans+=s.charAt(j);
            }
            for(int j=0;j<n-i;j++){
                ans+=s.charAt(j);
            }
            
            System.out.println(ans);
        }
    }
}