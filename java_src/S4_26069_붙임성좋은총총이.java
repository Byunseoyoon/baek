package java_src;

import java.io.*;
import java.util.*;

public class S4_26069_붙임성좋은총총이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            if(A.equals("ChongChong") || B.equals("ChongChong") ) set.add("ChongChong");
            if(set.contains(A)) set.add(B);
            else if(set.contains(B)) set.add(A);
        }

        bw.write(set.size()+"");
        bw.flush();
    }
}