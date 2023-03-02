// Given a string and two characters. Print the minimum distance between two given characters a and b in a string.import java.io.*;
import java.util.*;

public class FindTheDistancebetweenTwoCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char ch=sc.next().charAt(0);
        char ch1=sc.next().charAt(0);
        System.out.println(s1.indexOf(ch1)-s1.indexOf(ch)-1);
    }
}