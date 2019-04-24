import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        //int n=(int)Math.pow(queries.length,queries.length);
        int[] tab=new int[100000];
        int k=0;
        for(int i=0;i<s.length();){
            int j=i, sum=0;
            do{
                int x=(int)s.charAt(j)-96;
                //System.out.println(x);
                sum+=x;
                //System.out.println(sum);
                tab[k]=sum;
                //System.out.println(k);
                //System.out.println(tab[k]);
                k++;
                j++;
            }while(j<s.length()&&s.charAt(j-1)==s.charAt(j));
            i=j;
        }
        String[] result=new String[queries.length];
        /*System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.println(tab[i]);
        }*/
        Arrays.sort(tab);
        
        for(int i=0;i<queries.length;i++){
            //System.out.println(queries[i]);
            if(Arrays.binarySearch(tab,queries[i])>=0){
                result[i]="Yes";
            }
            else{
                result[i]="No";
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
