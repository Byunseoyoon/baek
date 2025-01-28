package java_src;

import java.io.*;

public class S3_9095_123더하기 {
    static Integer[] dp;

    private static int find(int n){
        if(dp[n]==null && n>3){
            dp[n] = find(n-1)+find(n-2)+find(n-3);
        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());       // 초기 입력되어 있는 문자열

        int[] arr = new int[N];
        int max=0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max) max = arr[i];
        }
        dp = new Integer[max+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        find(max);

        for(int x:arr)
            System.out.println(dp[x]);
    }


}
