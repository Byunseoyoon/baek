package java_src;

import java.io.*;
import java.util.*;

public class S1_14889_스타트와링크 {
    private static int N;
    private static boolean[] visited;
    private static int[][] S;
    private static int min = Integer.MAX_VALUE;

    static void back(int count, int index){
        if(count==N/2){
            int start=0, link=0;
            for(int i=0; i<N; i++)
                for(int j=i+1; j<N; j++){
                    if(visited[j] && visited[i]) start += S[i][j]+ S[j][i];
                    else if ((!visited[j]) && (!visited[i])) link+=S[i][j]+ S[j][i];
                }

            min = Math.min(Math.abs(start-link), min);
            return;
        }

        for(int i=index; i<N; i++){
            if(!visited[i]){
                visited[i]=true;
                back(count+1, i+1);
                visited[i]=false;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        visited = new boolean[N];
        S = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N;j++){
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        back(0,0);
        System.out.println(min);
    }
}
