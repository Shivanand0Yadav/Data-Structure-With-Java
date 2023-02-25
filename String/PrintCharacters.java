// Given a string. Print all its characters such that each character is printed in a separate line.import java.io.*;
import java.util.*;

public class PrintCharacters {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}