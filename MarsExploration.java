import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        /*s=s.replace("SOS","");
        return s.length()/3;*/
        int c=0;
        for(int i=0;i<s.length();i=i+3){
            if(s.charAt(i)!='S'){ c++; }
            if(s.charAt(i+1)!='O'){ c++; }
            if(s.charAt(i+2)!='S'){ c++; }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
