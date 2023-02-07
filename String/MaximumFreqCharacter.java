import java.io.*;
import java.util.*;

public class MaximumFreqCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] freq=new int[127];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]=freq[s.charAt(i)]+1;
        }
        int max=0;
        char ch=' ';
        for(int i=0;i<s.length();i++){
            if(max<freq[s.charAt(i)]){
                max=freq[s.charAt(i)];
                ch=s.charAt(i);
            }
        }
        System.out.println(ch);
        
    }
}