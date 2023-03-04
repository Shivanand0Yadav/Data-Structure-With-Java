// 
import java.io.*;
import java.util.*;

public class DesiredString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        int min=-1;
        int max=-1;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='A'){
                count++;
                if(min==-1){
                    min=j;
                }
                max=j;
            }
        }
        if(count!=0){
            int m=(count*(count-1))/2;
            System.out.println(m);
            System.out.println(max-min+1);
            System.out.println(s.substring(min,max+1));
        }else
            System.out.println(-1);
    }
}