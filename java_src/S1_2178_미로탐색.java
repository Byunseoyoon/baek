package java_src;

import java.io.*;
import java.util.*;

class Point{
    int x, y;

    Point(int x, int y){
        this.x= x;
        this.y=y;
    }
}
public class S1_2178_미로탐색 {
    private static int[][] map;
    private static boolean[][] visited;
    private static int N, M;
    private static int[] dx={-1, 1, 0, 0};
    private static int[] dy={0, 0, -1,1};

    private static void bfs(){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0));
        visited[0][0]=true;

        while(!q.isEmpty()){
            Point next = q.poll();
            for(int i=0;i<4;i++){
                int nextX = next.x + dx[i];
                int nextY = next.y + dy[i];

                if(nextX<0 || nextY<0 || nextX>=N || nextY>=M || visited[nextX][nextY] || map[nextX][nextY]==0) continue;

                q.offer(new Point(nextX, nextY));
                visited[nextX][nextY]=true;
                map[nextX][nextY] = map[next.x][next.y]+1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i=0;i<N;i++){
            String in = br.readLine();
            for (int j = 0; j < M; j++)
                map[i][j] = Integer.parseInt(in.charAt(j)+"");
        }

        visited = new boolean[N][M];
        bfs();
        System.out.println(map[N-1][M-1]);
    }
}
