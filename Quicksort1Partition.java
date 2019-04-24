import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> equal = new ArrayList<Integer>(Arrays.asList(arr[0]));
        //equal.add(arr[0]);
        List<Integer> right = new ArrayList<Integer>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[0]){
                right.add(arr[i]);
            }
            else if(arr[i]<arr[0]){
                left.add(arr[i]);
            }
            else{
                equal.add(arr[i]);
            }
        }
        int j=0;
        for(int i=0;i<size(left);i++,j++){
            arr[j]=elementAt(left,i);
        }
        for(int i=0;i<size(equal);i++,j++){
            arr[j]=elementAt(equal,i);
        }
        for(int i=0;i<size(right);i++,j++){
            arr[j]=elementAt(right,i);
        }
        return arr;
    }
    
    public static int size(List<Integer> data){
        int total = 0;
        for (Integer sublist : data) {
            // TODO: Null checking
            total ++;
        }
        return total;
    }
    
    public static int elementAt(List<Integer> list, int x){
        int j=0;
        for(Integer i:list){
            if(j==x){ return i;}
            j++;
        }
        
        return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
