import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pangrams function below.
     */
    static String pangrams(String s) {
        s=s.toLowerCase();
        s=s.replace(" ","");
        boolean[] arg=new boolean[26];
        for(int i=0;i<s.length();i++){
            int t=s.charAt(i)-97;
            arg[t]=true;
        }
        int i;
        for(i=0; i<26 && arg[i]==true ; i++);
        if(i==26){ return "pangram";}
        return "not pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
