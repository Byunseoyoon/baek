package java_src;

import java.io.*;
import java.util.*;

public class S2_24480_알고리즘수업_깊이우선탐색2 {
    private static List<Integer>[] graph;
    private static boolean[] visited;
    private static int[] order;
    private static int cnt=1;

    private static void dfs(int u){
        visited[u] = true;
        order[u] = cnt++;
        List<Integer> list = graph[u];
        list.sort(Collections.reverseOrder());
        for(int v: list)
            if(!visited[v]) dfs(v);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        visited = new boolean[N + 1];
        order = new int[N + 1];

        for (int i = 1; i < N + 1; i++) graph[i] = new ArrayList<>();

        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(R);
        for (int i = 1; i <= N; i++) {
            bw.write(order[i] + "\n");
        }
        bw.flush();
    }
}
