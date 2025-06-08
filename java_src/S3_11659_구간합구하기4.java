package java_src;

import java.io.*;
import java.util.*;

public class S3_11659_구간합구하기4 {
    public static void main(String[] args) throws IOException{
        StringBuilder sb =new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] input = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N;i++)
            input[i]= Integer.parseInt(st.nextToken());

        int[] preSum = new int[N+1];
        for(int i=1; i<N+1; i++)
            preSum[i] = preSum[i-1]+input[i];

        for(int x=0; x<M; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(preSum[j]-preSum[i-1]).append("\n");
        }

        System.out.println(sb);
    }
}
