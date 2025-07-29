package java_src;

import java.io.*;
import java.util.*;

public class S2_21736_헌내기는친구가필요해 {
    private static char[][] univ;
    private static boolean[][] isVisited;
    private static int N;
    private static int M;
    private static int cnt;

    private static void check(int x, int y){
        if(isVisited[x][y] || univ[x][y]=='X' || (x>N-1 && y>M-1)) return;
        if(univ[x][y]=='P') cnt++;

        isVisited[x][y] = true;

        if(y > 0) check(x, y - 1 );
        if(x > 0) check(x - 1, y);
        if(x<N-1) check(x+1,y);
        if(y<M-1) check(x, y + 1);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        univ = new char[N][M];
        isVisited = new boolean[N][M];
        int x=0, y=0;

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                univ[i][j] = line.charAt(j);
                if(univ[i][j]=='I'){
                    x=i;
                    y=j;
                }
            }
        }

        cnt = 0;
        check(x, y);
        bw.write(cnt == 0 ? "TT" : cnt + "");
        bw.flush();
    }
}
