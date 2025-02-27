package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1003_피보나치함수 {
    public static void main(String[] args) throws IOException{
        StringBuilder sb =new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] input = new int[T];
        int max =2;
        for(int i=0; i<T;i++){
            input[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, input[i]);
        }

        int[][] dp = new int[max+1][2];
        dp[0][0] = dp[1][1] = 1;
        dp[0][1] =dp[1][0] = 0;
        for(int i=2;i<=max;i++){
            dp[i][0] = dp[i-1][0]+ dp[i-2][0];
            dp[i][1] = dp[i-1][1]+ dp[i-2][1];
        }

        for(int x: input){
            sb.append(dp[x][0]).append(" ").append(dp[x][1]).append("\n");
        }

        System.out.println(sb);
    }
}
