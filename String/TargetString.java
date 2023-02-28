// Take Two Strings as input. First string as "str" and second string as a "Target" string.
// You are allowed to rotate the original string "str" multiple times.
// Print "True" if "Target" string can be achieved by rotating the "str" any number of times else print "False".
// Note: String "bcda" is a rotation of "abcd" but "bdca" is not a rotation of String "abcd".
import java.io.*;
import java.util.*;

public class TargetString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String ss=s1+s1;
        if(ss.contains(s2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
}