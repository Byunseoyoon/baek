package java_src;

import java.io.*;
import java.util.*;

public class S2_11724_연결요소의개수 {
    private static List<Integer>[] graph;
    private static boolean[] visited;

    private static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        visited[start] =true;
        q.offer(start);
        while(!q.isEmpty()){
            for(int x:graph[q.poll()]){
                if(visited[x])  continue;
                q.offer(x);
                visited[x] =true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        for (int i = 0; i < N + 1; i++) graph[i] = new ArrayList<Integer>();

        for(int i=0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[N + 1];
        int cnt=0;
        for(int i=1; i<N+1;i++){
            if(!visited[i]){
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
