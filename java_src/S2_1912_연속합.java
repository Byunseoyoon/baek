package java_src;

import java.io.*;
import java.util.*;

public class S2_1912_연속합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[n];
        int[] dp = new int[n];

        for(int i=0; i<n; i++){
            input[i]= Integer.parseInt(st.nextToken());
        }

        dp[0] = input[0];
        int max = dp[0];

        for(int i=1; i<n; i++){
            dp[i] = Math.max(input[i], dp[i-1]+input[i]);
            max = Math.max(max, dp[i]);
        }

        bw.write(max+ "");    // 범위
        bw.flush();
    }
}
