// Take a String str as input and calculate the Power of the string.
// Power of a string is defined as the maximum length of substring that contains only one unique character.
// -> A substring is a continuous sequence of characters within a string.
// Note: All characters in the string are in lowercase.
import java.io.*;
import java.util.*;

public class PowerOfaString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=-1;
        int cur=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }
            else{
                if(cur>max)
                    max=cur;
                cur=1;
            }
            
        }
        if(max<cur){
            max=cur;
        }
        System.out.println(max);
    }
}