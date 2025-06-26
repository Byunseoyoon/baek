package java_src;

import java.io.*;
import java.util.*;

public class B3_2525_오븐시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int min = (B+C) % 60;
        int hour =((B+C)/60 +A)%24;

        bw.write(hour+" "+min);
        bw.flush();
    }
}
