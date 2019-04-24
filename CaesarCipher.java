import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=97&&ch[i]<=122){
                ch[i]+=k;
                ch[i]-=97;
                ch[i]%=26;
                ch[i]+=97;
            }
            else if(ch[i]>=65&&ch[i]<=90){
                ch[i]+=k;
                ch[i]-=65;
                ch[i]%=26;
                ch[i]+=65;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
