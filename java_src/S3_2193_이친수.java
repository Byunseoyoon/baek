package java_src;

import java.io.*;

public class S3_2193_이친수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N + 1][2]; // dp는 N 자리 0으로 끝나는 개수, 1로 끝나는 개수를 의미

        dp[1][0] =0;
        dp[1][1] =1;

        for(int i=2; i<=N; i++){
            dp[i][0]= dp[i-1][1]+ dp[i-1][0];
            dp[i][1]= dp[i-1][0];   // 1로 끝나는건 무조건 0으로 끝나는거만 가능
        }

        bw.write(dp[N][0] + dp[N][1] + "");
        bw.flush();

    }

}
