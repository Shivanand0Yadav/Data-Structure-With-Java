import java.io.*;
import java.util.*;

public class PrintFirstVowelOccurrence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] chr=new char[n];
        for(int i=0;i<n;i++){
            chr[i]=sc.next().charAt(0);
            if(chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'|| chr[i]=='u'){
                System.out.println(i);
                break;
            }
        }
    }
}