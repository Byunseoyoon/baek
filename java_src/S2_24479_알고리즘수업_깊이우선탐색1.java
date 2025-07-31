package java_src;

import java.io.*;
import java.util.*;

public class S2_24479_알고리즘수업_깊이우선탐색1 {
    private static List<Integer>[] arr;
    private static boolean[] visited;
    private static int[] ordered;
    private static int N, M, cnt=1;

    private static void dfs(int R) {
        visited[R] = true;
        ordered[R] = cnt++;
        List<Integer> list = arr[R];
        Collections.sort(list);
        for(int x: list)
            if(!visited[x]) {
                dfs(x);
            }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        ordered = new int[N+1];
        arr = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) arr[i] = new ArrayList<>();

        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v= Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }

        dfs(R);
        for (int i = 1; i <= N; i++) {
            bw.write(ordered[i] + "\n");
        }
        bw.flush();
    }
}
