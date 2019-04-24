import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        for(int i=1;i<n;i++){
            //System.out.println(i);
            int[] k=Arrays.copyOfRange(arr,0,i+1);
            insertionSort1(i+1,k);
            for(int j=0;j<i+1;j++){
                arr[j]=k[j];
            }
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        
    }
    
    static void insertionSort1(int n, int[] arr) {
        int e=arr[n-1],i;
        for(i=n-2;i>=0;i--){
            if(arr[i]>e){
                arr[i+1]=arr[i];
            }
            else{
                arr[i+1]=e;
                break;
            }
        }
        if(i==-1){
            arr[i+1]=e;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
