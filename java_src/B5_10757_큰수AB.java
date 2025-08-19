package java_src;

import java.io.*;
import java.math.*;
import java.util.*;

public class B5_10757_큰수AB {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        System.out.print(A.add(B));


    }
}
