package java_src;

import java.io.*;
import java.util.*;

public class S2_1260_DFS와BFS {
    private static HashMap<Integer, List<Integer>> adjList = new HashMap<>(); ;
    private static StringBuilder  sb= new StringBuilder();;
    private static Set<Integer> visited = new HashSet<>();;

    private static void addVertexAndEdge(int u, int v){
        adjList.putIfAbsent(u, new ArrayList<>());  // add vertex
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v); // add Edge
        adjList.get(v).add(u);
    }

    private static void dfs(int vertex){
        if(visited.contains(vertex)) return;

        sb.append(vertex).append(" ");
        visited.add(vertex);
        List<Integer> list = adjList.getOrDefault(vertex, new ArrayList<>());
        Collections.sort(list);
        for(int x: list) dfs(x);
    }

    private static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        visited.clear();
        visited.add(start);

        q.offer(start);
        sb.append("\n").append(start).append(" ");

        while(!q.isEmpty()){
            int curr = q.poll();
            List<Integer> list = adjList.getOrDefault(curr, new ArrayList<>());
            Collections.sort(list);
            for(int neighbor: list){
                if(visited.contains(neighbor)) continue;
                sb.append(neighbor).append(" ");
                q.offer(neighbor);
                visited.add(neighbor);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // number of vertex
        int M = Integer.parseInt(st.nextToken());   // number of line
        int V = Integer.parseInt(st.nextToken());   // start vertex

        for(int i=0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            addVertexAndEdge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        dfs(V);
        bfs(V);

        bw.write(sb+"");
        bw.flush();
        bw.close();

    }
}
