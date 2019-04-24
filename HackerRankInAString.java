import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String hackerrankInString(String s) {
        // Complete this function
        char[] ch={'h','a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int i=0, j=0;
        while(i<ch.length&&j<s.length()){
            //System.out.println("i = "+i+" j = "+j);
            if(ch[i]==s.charAt(j)){
                i++;                
            }
            j++;
        }
        if(i==ch.length){ return "YES";}
        else{ return "NO";}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
