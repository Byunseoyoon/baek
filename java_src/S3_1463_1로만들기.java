package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class S3_1463_1로만들기 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N+1];
        dp[0]=0;
        dp[1]=0;
        if(N>=2) dp[2]=1;
        if(N>=3) dp[3]=1;

        if(N>3)
            for(int i=4; i<=N; i++){
                dp[i] = dp[i - 1]+1;
                if(i%2==0)
                    dp[i]=Math.min(dp[i], dp[i/2]+1);
                if(i%3==0)
                    dp[i]=Math.min(dp[i], dp[i/3]+1);
            }

        System.out.println(dp[N]);

    }


}
