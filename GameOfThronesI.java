import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        //StringBuffer str=new StringBuffer(s);
        char[] chr=s.toCharArray();
        Arrays.sort(chr);
        int count=0;
        for(int i=0;i<chr.length;){
            if(i<chr.length-2&&chr[i]==chr[i+1]){
                i=i+2;
            }
            else{
                i++;
                count++;
            }
            if(chr.length-i==2){
                if(chr[i]==chr[i+1]){
                    i=i+2;
                }
                else{
                    i++;
                    count++;
                }
            }
            else if(chr.length-i==1){
                i++;
                count++;
            }
            
        }
        if(count<=1){ return "YES"; }
        else{ return "NO"; }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
