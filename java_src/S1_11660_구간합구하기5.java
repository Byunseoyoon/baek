package java_src;

import java.io.*;
import java.util.*;

public class S1_11660_구간합구하기5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][N+1];
        int[][] prefixSum = new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                prefixSum[i][j] = arr[i][j]+ prefixSum[i][j-1] + prefixSum[i-1][j] - prefixSum[i-1][j-1];
            }
        }



        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            bw.write(prefixSum[x2][y2] - prefixSum[x1-1][y2] - prefixSum[x2][y1-1] + prefixSum[x1-1][y1-1]+"\n");
        }
        bw.flush();
    }
}
