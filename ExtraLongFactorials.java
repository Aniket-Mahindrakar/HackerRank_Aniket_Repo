import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger f=new BigInteger("1");
        String s=""+n;
        BigInteger t=new BigInteger(s);
        while(!t.equals(new BigInteger("1"))){
            f=f.multiply(t);
            t=t.subtract(BigInteger.ONE);
        }
        System.out.println(f);
    }
}
