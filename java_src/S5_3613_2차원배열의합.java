package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class S5_3613_2차원배열의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][M+1];
        long[][] preSum = new long[N+1][M+1];

        for(int i=1;i<=N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                preSum[i][j] = arr[i][j] + preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1];
            }
        }

        int K = Integer.parseInt(br.readLine());
        while(K-->0){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sb.append(preSum[x][y] - preSum[i-1][y] - preSum[x][j-1] + preSum[i-1][j-1]).append("\n");
        }

        System.out.println(sb);
    }
}
