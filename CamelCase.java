import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int camelcase(String s) {
        // Complete this function
        int c=1;
        char[] str=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(str[i])){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
