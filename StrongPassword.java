import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String pass) {
        // Return the minimum number of characters to make the password strong
        int c,cd=1,clc=1,cuc=1,cs=1;
        StringBuffer p=new StringBuffer(pass);
        for(int i=0;i<p.length();i++){
            char k=pass.charAt(i);
            if(Pattern.matches("[!@#$%^&*()+-]",""+k)){
                cs=0;    
            }
            else if(Character.isUpperCase(k)){
                cuc=0;
            }
            else if(Character.isLowerCase(k)){
                clc=0;
            }
            else if(Character.isDigit(pass.charAt(i))){
                cd=0;
            }
        }
        c=cd+clc+cuc+cs;
        if(n+c<6){
            return 6-n;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
