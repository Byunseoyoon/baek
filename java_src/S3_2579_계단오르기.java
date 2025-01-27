package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class S3_2579_계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());       // 초기 입력되어 있는 문자열
        int[] stairs = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++)
            stairs[i] = Integer.parseInt(br.readLine());

        dp[1] = stairs[1];
        if(N>=2)
            dp[2] = stairs[2] + dp[1];

        for(int i=3; i<=N; i++)
            dp[i] = Math.max(dp[i-2] , dp[i-3]+ stairs[i-1]) + stairs[i];

        System.out.println(dp[N]);
    }
}
