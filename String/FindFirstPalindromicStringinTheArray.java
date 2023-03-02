// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an string "empty".
// A string is palindromic if it reads the same forward and backward
import java.io.*;
import java.util.*;

public class FindFirstPalindromicStringinTheArray {
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        String s1="";
        boolean bool=false;
        for(int i=0;i<n;i++){
            String s=str[i];
            if(isPalindrome(s)){
                s1=s;
                System.out.println(s);
                break;
            }
        }
        if(s1.length()==0){
            System.out.println("empty");
        }
    }
}