// Take two Strings str and target as input. Print "True" if str is a subsequence of target else print "False".
// Note: A subsequence of a string is a sequence that can be derived from the given string by deleting zero or more elements without changing the 
// order of the remaining elements. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
import java.io.*;
import java.util.*;

public class CheckSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res=sc.next();
        int i=0,j=0;
        while(i<str.length() && j<res.length()){
            if(str.charAt(i)==res.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==str.length()){
            System.out.println("True");
        }else
            System.out.println("False");
    }
}