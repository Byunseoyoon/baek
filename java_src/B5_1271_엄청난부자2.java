package java_src;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class B5_1271_엄청난부자2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());
        System.out.println(n.divide(m)+"\n"+ n.remainder(m));
    }
}
