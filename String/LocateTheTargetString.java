// Given two strings str & target, return the index where target string occurs for the first time in String str.

import java.io.*;
import java.util.*;

public class LocateTheTargetString {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.indexOf(s2));
    }
}