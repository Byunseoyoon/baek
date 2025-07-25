package java_src;

import java.io.*;
import java.util.*;

public class S1_1149_RGB거리 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] cost = new int[N][3];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++){
            cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]); // i번 집이 R
            cost[i][1] += Math.min(cost[i-1][0], cost[i-1][2]); // i번 집이 G
            cost[i][2] += Math.min(cost[i-1][0], cost[i-1][1]); // i번 집이 B
        }

        bw.write(Math.min(cost[N - 1][0], Math.min(cost[N - 1][1], cost[N - 1][2]))+" ");
        bw.flush();
    }
}
