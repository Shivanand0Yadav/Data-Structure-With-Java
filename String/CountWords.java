// Given a string. Print the count of the number of words in a string.import java.io.*;
import java.util.*;

public class CountWords {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}