package java_src;

import java.io.*;
import java.util.*;

public class S4_14425_문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        while(N-->0)
            set.add(br.readLine());

        int cnt=0;
        while(M-->0)
            if(set.contains(br.readLine())) cnt++;

        bw.write(cnt+"");
        bw.flush();
    }
}
