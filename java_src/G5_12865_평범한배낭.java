package java_src;

import java.io.*;
import java.util.*;
public class G5_12865_평범한배낭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] weight = new int[N];
        int[] value = new int[N];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            weight[i] =Integer.parseInt(st.nextToken());
            value[i] =Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[K+1];

        for(int i=0; i<N; i++){
            for(int w=K; w>=weight[i]; w--)
                dp[w] = Math.max(dp[w], dp[w-weight[i]]+value[i]);
        }

        System.out.println(dp[K]);
    }
}
