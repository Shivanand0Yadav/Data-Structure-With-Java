// Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings 
// are grouped consecutively. Substrings that occur multiple times are counted the number of times they occur.
// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/count-binary-substrings
import java.io.*;
import java.util.*;

public class CountSubstringof0And1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int curr = 1, prev = 0, ans = 0;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(i-1)) 
                curr++;
            else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        System.out.println((ans+Math.min(curr,prev)));
    }
}