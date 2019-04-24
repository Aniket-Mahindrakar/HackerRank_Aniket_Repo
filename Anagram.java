import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {
        if(s.length()%2==0){
            StringBuffer s1=new StringBuffer(s.substring(0,s.length()/2));
            char[] c2=s.substring(s.length()/2,s.length()).toCharArray();
            int count=0, j;
            for(int i=0;i<s.length()/2;i++){
                if((j=s1.toString().indexOf(c2[i]))>=0){
                    s1.delete(j,j+1);
                }
                else{
                    count++;
                }
            }
            return count;
        }
        else{
            return -1;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
