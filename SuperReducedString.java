import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function
        StringBuffer str=new StringBuffer(s);
        do{
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)==str.charAt(i+1)){
                    str.delete(i,i+2);
                }
            }
            if(str.length()==0){
                return "Empty String";
            }
        }while(check(str));
        return str.toString();
    }
    
    static Boolean check(StringBuffer str){
        int i;
        for(i=0;i<str.length()-1 && str.charAt(i)!=str.charAt(i+1);i++);
        if(i==str.length()-1){return false;}
        else{return true;}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
