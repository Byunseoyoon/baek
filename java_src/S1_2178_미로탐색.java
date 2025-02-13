package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_2178_미로탐색 {
    private static int[][] arr;
    private static boolean[][] visit;
    private static int N, M;
    private static int cnt;
    private static int min;
    private static void bfs(int x, int y){
        if(x == N-1 && y == M-1){
            if(min<0 || cnt<min) min=cnt;
            return;
        }

        if(x+1<N && arr[x+1][y]==1 && !visit[x+1][y]){
            cnt++;
            bfs(x + 1, y);
        }
        if(x>0 && arr[x-1][y]==1){
            cnt++;
            bfs(x -1, y);
        }
        if(y+1<M && arr[x][y+1]==1) {
            cnt++;
            bfs(x, y + 1);
        }
        if(y>0 && arr[x][y-1]==1) {
            cnt++;
            bfs(x, y - 1);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for(int i=0;i<N;i++){
            String in = br.readLine();
            for (int j = 0; j < M; j++)
                arr[i][j] = Integer.parseInt(in.charAt(j)+"");
        }

        cnt=1;
        min=-1;
        visit = new boolean[N][M];
        bfs(0,0);
        System.out.println(min);
    }
}
