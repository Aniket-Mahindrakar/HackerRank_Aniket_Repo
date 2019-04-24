import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int i;
        String r= new StringBuffer(s).reverse().toString();
        for(i=0;i<s.length()-1;i++){
            int x=Math.abs((int)s.charAt(i+1)-(int)s.charAt(i));
            int y=Math.abs((int)r.charAt(i+1)-(int)r.charAt(i));
            if(x!=y){ break;}
        }
        if(i==s.length()-1){
            return "Funny";
        }
        else{
            return "Not Funny";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
