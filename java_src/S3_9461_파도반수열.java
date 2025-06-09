package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class S3_9461_파도반수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] input = new int[T];
        int max=0;
        for(int i=0; i<T;i++){
            input[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, input[i]);
        }

        long[] P = new long[Math.max(4, max+1)];
        P[1]=P[2]=P[3]=1;

        for(int i=4; i<=max; i++){
            P[i] = P[i-2] + P[i-3];
        }

        StringBuilder sb = new StringBuilder();
        for(int x: input)
            sb.append(P[x]).append("\n");

        System.out.println(sb);
    }


}
