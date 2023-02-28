// Take a String str as input, and check whether the string is Palindrome or not.
// Print "Palindrome" if the string is Palindrome else print "Not a Palindrome".
// Note: A string is called a palindrome string if the reverse of that string is the same as the original string.
// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/valid-palindrom
import java.io.*;
import java.util.*;

public class IsPalindrome {
    static boolean isPalindrome(String s){
        int ptr1=0,ptr2=s.length()-1;
        while(ptr1<ptr2){
            if(s.charAt(ptr1)==' '){
                ptr1++;
            }
            if(s.charAt(ptr2)==' '){
                ptr2--;
            }
            if(s.charAt(ptr1)!=s.charAt(ptr2)){
                return false;
            }else{
                ptr1++;
                ptr2--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean ans=isPalindrome(s);
        if(ans){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}