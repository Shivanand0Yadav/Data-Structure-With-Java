// Take two strings as input. Check if both these strings are exactly equal or not.
import java.io.*;
import java.util.*;

public class IsEqual {
    static boolean isEqual(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(isEqual(str1,str2));
    }
}