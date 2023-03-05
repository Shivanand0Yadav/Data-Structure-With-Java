// import java.io.*;
import java.util.*;

public class CountConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=-1;
        int cur=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cur++;
            }
            else{
                if(cur>max)
                    max=cur;
                cur=0;
            }
            
        }
        if(max<cur){
            max=cur;
        }
        System.out.println(max);
    }
}