package java_src;

import java.io.*;
import java.util.*;

public class S3_2606_바이러스 {
    private static boolean[] visited;
    private static List<Integer>[] graph;

    private static int dfs(int u){
        visited[u] = true;
        int cnt =0;
        for(int x: graph[u])
            if(!visited[x])
                cnt+=1+dfs(x);
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) graph[i] = new ArrayList<>();

        for(int i=0; i<pair;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[n+1];
        bw.write(dfs(1)+"");
        bw.flush();
        bw.close();
    }

}
