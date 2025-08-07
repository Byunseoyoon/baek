package java_src;

import java.io.*;
import java.util.*;

public class S3_15654_N과M5 {
    private static int N;
    private static int M;
    private static int[] input;
    private static int[] output;
    private static boolean[] visited;
    private static StringBuilder sb;

    private static void back(int depth){
        if(depth ==M){
            for(int x: output)
                sb.append(x).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(visited[i]) continue;
            output[depth] = input[i];
            visited[i] = true;
            back(depth + 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        input = new int[N];
        output = new int[M];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        back(0);

        bw.write(sb+"");
        bw.flush();

    }
}
