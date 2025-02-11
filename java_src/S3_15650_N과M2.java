package java_src;

import java.io.*;
import java.util.*;

public class S3_15650_N과M2 {
    private static int N, M;
    private static StringBuilder sb;
    private static int[] arr;

    public static void main(String[] args) throws IOException{
        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        back(0, 1);
        System.out.println(sb);
    }

    private static void back(int depth, int start){
        if(depth==M){
            for(int x: arr)
                sb.append(x).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=start; i<N+1;i++){
            arr[depth] = i;
            back(depth + 1, i + 1);
        }
    }
}
