//Find the total number of unique digits in a given string. Use the Array as a Hashmap strategy here.

import java.io.*;
import java.util.*;

public class FindUnique {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] num=new int[10];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'0';
            num[idx]++;
        }
        int cnt=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>=1){
               cnt++; 
            }
        }
        System.out.println(cnt);
    }
}