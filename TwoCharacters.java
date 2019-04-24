import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twoCharaters(String s) {
        int c=1, l=s.length();
        char[] letters=new char[26];
        letters[0]=s.charAt(0);
        for(int i=1;i<l;i++){
            if(!Pattern.matches("["+new String(letters)+"]",""+s.charAt(i))){
                letters[c]=s.charAt(i);
                c++;
            }
        }
        //System.out.println("Letters: "+new String(letters));
        String[] str=new String[500];
        int ct=0;
        
        for(int i=0;i<letters.length-1;i++){
            for(int j=i+1;j<letters.length;j++){
                String t=s;
                for(int k=0;k<letters.length;k++){
                    if(k==i||k==j){
                        continue;
                    }
                    else{
                        t=t.replace(""+letters[k],"");
                    }
                }
                //t=t.replace(""+letters[i],"").replace(""+letters[j],"");
                //System.out.println("i = "+i+" j = "+j+" t = "+t);
                if(check(t)){
                    str[ct]=t;
                    //System.out.println(str[ct]);
                    ct++;
                }
            }
        }
        
        if(ct==0){
            return 0;
        }
        int max=maximum(str,ct);
        return max;
    }
    
    static Boolean check(String t){
        int i,j,k;
        for(i=0, j=1, k=2;i<t.length()-2&&t.charAt(i)!=t.charAt(j)&&t.charAt(i)==t.charAt(k);i++,j++,k++);
        if(i==t.length()-2){
            return true;
        }
        else{return false;}
    }
    
    static int maximum(String[] str, int c){
        int max=str[0].length();
        for(int i=1;i<c;i++){
            int l=str[i].length();
            if(l>max){
                max=l;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
