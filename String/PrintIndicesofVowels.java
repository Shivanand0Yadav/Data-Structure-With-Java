// Take an string from user and print the indices of vowels in a string.
import java.io.*;
import java.util.*;

public class PrintIndicesofVowels {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u'){
                System.out.print(i+" ");
            }
        }
    }
}