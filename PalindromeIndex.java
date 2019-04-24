import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        int count=0,n=-1;
        char[] chr=s.toCharArray();
        for(int i=0, j=s.length()-1;i<s.length()/2&&j>s.length()/2;i++,j--){
            if(chr[i]!=chr[j]&&count<1){
                if(chr[i+1]==chr[j]&&chr[i+2]==chr[j-1]){
                    n=i;
                    i++;
                }
                else if(chr[i]==chr[j-1]&&chr[i+1]==chr[j-2]){
                    n=j;
                    j--;
                }
                else{
                    break;
                }
                count++;
            }
            /*else if(count>=1){
                n=-1;
                break;
            }*/
        }
        //System.out.println(b);
        return n;
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
