// For a given input string(str), write a function to print all the possible substrings.
import java.io.*;
import java.util.*;

public class PrintAllSubstrings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}