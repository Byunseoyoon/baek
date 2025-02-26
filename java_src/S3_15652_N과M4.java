package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_15652_N과M4 {
    private static int N;
    private static int M;
    private static StringBuilder sb;
    private static int[] arr;

    public static void back(int depth, int start){
        if(depth==M){
            for(int x: arr)
                sb.append(x).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=start; i<=N; i++){
            arr[depth] = i;
            back(depth+1, i);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        arr = new int[M];
        back(0, 1);

        System.out.println(sb);
    }
}
