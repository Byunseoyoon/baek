package java_src;

import java.io.*;
import java.util.*;

public class S2_24444_알고리즘수업_너비우선탐색1 {
    private static int[] bfs(int N, int R, List<Integer>[] graph){
        boolean[] visited = new boolean[N + 1];
        int[] order = new int[N + 1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(R);

        int cnt=1;
        visited[R] = true;
        order[R] = cnt++;

        while(!q.isEmpty()){
            List<Integer> list = graph[q.poll()];
            Collections.sort(list);
            for (int x: list) {
                if (!visited[x]){
                    visited[x] = true;
                    order[x] = cnt++;
                    q.offer(x);
                }
            }
        }
        return order;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        List<Integer>[] graph = new ArrayList[N+1];
        for(int i=0;i<=N; i++ ){
            graph[i] = new ArrayList<>();
        }

        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        int[] order = bfs(N, R, graph);

        for (int i = 1; i <= N; i++) {
            bw.write(order[i] + "\n");
        }
        bw.flush();
    }
}
