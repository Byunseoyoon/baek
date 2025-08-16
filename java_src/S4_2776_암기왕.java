package java_src;

import java.io.*;
import java.util.*;

public class S4_2776_암기왕 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            int N = Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());


            while (N-- > 0) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            int[] arr = new int[M];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int x : arr)
                bw.write(set.contains(x) ? "1\n" : "0\n");
        }
        bw.flush();
    }
}