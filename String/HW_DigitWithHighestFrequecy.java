// Given a number as an integer input. Check which digit occurs the maximum number of times. Print that digit.

import java.io.*;
import java.util.*;

public class HW_DigitWithHighestFrequecy {
    static int countOccurrences(int x,int d){
        int count = 0;
        while (x > 0){
            if (x % 10 == d)
                count++;
                x = x / 10;
            }
                return count;
        }
    static int maxOccurring( int x){
        if (x < 0)
        x = -x;
        int result = 0;
        int max_count = 1;
        for (int d = 0; d <= 9; d++){
            int count = countOccurrences(x, d);
            if (count >= max_count){
                max_count = count;
                result = d;
            }
    }
return result;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(maxOccurring(n));
    }
}