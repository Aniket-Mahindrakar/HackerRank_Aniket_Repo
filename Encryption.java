import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        int l = s.length();
        int n = (int) Math.floor(Math.sqrt(l)), m = (int) Math.ceil(Math.sqrt(l)); 
        if(n*m < l){
            n++;
        }
        char[][] temp=new char[n][m];
        int c=0;
        for(int i=0;i<n&&c<l;i++){
            for(int j=0;j<m&&c<l;j++,c++){
                temp[i][j] = s.charAt(c);
            }
        }
        StringBuffer result=new StringBuffer("");
        for(int j=0; j<m; j++){
            for(int i=0; i<n && temp[i][j]!='\0'; i++){
                result.append(temp[i][j]);
                //System.out.println(temp[i][j]);
            }
            result.append(' ');
        }
        return result.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
