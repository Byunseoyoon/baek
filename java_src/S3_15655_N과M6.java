package java_src;

import java.io.*;
import java.util.*;

public class S3_15655_N과M6 {
    private static int[] arr;
    private static int[] order;
    private static boolean[] visited;
    private static int N;
    private static int M;
    private static BufferedWriter bw;

    private static void back(int depth, int start) throws IOException{
        if(depth==M){
            for(int x:order)
                bw.write(x + " ");
            bw.write("\n");
            return;
        }

        for(int i=start; i<N; i++){
            if(visited[i]) continue;
            order[depth] = arr[i];
            visited[i] = true;
            back(depth+1, i+1);
            visited[i] = false;
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        order = new int[M];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        back(0, 0);

        bw.flush();
    }
}
