import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s11, String s12) {
        StringBuffer s1=new StringBuffer(s11);
        StringBuffer s2=new StringBuffer(s12);
        char[] c1=s11.toCharArray();
        char[] c2=s12.toCharArray();
        
        int[] x=new int[c2.length];
        
        int j,k=0;
        for(int i=0;i<s2.length();i++){
            if((j=s1.toString().indexOf(c2[i]))>=0){
                s1.delete(j,j+1);
                x[k]=i; k++;
            }
        }
        k--;
        for(;k>=0;k--){
            s2.delete(x[k],x[k]+1);
            //System.out.println(k+"\t"+x[0]+"\t"+s1+"\t"+s2);
        }
        return s1.length()+s2.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
