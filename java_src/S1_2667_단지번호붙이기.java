package java_src;

import java.io.*;
import java.util.*;

class Position{
    int i,j;
    public Position(int i, int j){
        this.i=i;
        this.j =j;
    }
}

public class S1_2667_단지번호붙이기 {
    static int[] x = {-1, 1, 0, 0};  // 상 하 좌 우
    static int[] y = {0, 0, -1, 1};   //  상 하 좌 우
    static int[][] map;
    static List<Integer> home = new ArrayList<>();


    private static void bfs(int N){
        boolean[][] visited = new boolean[N][N];
        Queue<Position> q = new LinkedList<>();


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visited[i][j] || map[i][j]!=1) continue;
                q.offer(new Position(i, j));
                visited[i][j] = true;
                int area=1;

                while(!q.isEmpty()){
                    Position p = q.poll();

                    for(int k=0; k<4; k++){
                        int u =p.i+ x[k];
                        int v = p.j + y[k];
                        if(u>=0 && v>=0 && u<N && v<N && map[u][v]==1 && !visited[u][v]){
                            area++;
                            q.offer(new Position(u, v));
                            visited[u][v] =true;
                        }
                    }
                }
                home.add(area);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for(int i=0;i<N;i++){
            String in = br.readLine();
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(in.charAt(j)+"");
            }
        }

        bfs(N);

        Collections.sort(home);

        bw.write(home.size()+"\n");
        for(int x: home)
            bw.write(x+"\n");

        bw.flush();

    }
}
