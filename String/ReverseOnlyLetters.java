// // Given a string s, reverse the string according to the following rules:
// // All the characters that are not English letters remain in the same position.
// // All the English letters (lowercase or uppercase) should be reversed.
// // Print s after reversing it.
// // NOTE:- After answering the question, attempt the related question in the linked resource
//  to improve your understanding of the question . Question Link -> https://leetcode.com/problems/reverse-only-letters
import java.io.*;
import java.util.*;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        char[] ch = s.toCharArray();
        
        while(i < j) {
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                
                i++;
                j--;
            } else if(!Character.isLetter(ch[i])) {
                i++;
            } else if(!Character.isLetter(ch[j])) {
                j--;
            }
        }
        
        return new String(ch);
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(reverseOnlyLetters(str));
    }
}