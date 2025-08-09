package java_src;

import java.io.*;
import java.util.*;

public class S5_8979_올림픽 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N =Integer.parseInt(st.nextToken());
        int K =Integer.parseInt(st.nextToken());
        int[][] medal = new int[N][4];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            medal[i][0] = Integer.parseInt(st.nextToken());
            medal[i][1] = Integer.parseInt(st.nextToken());
            medal[i][2] = Integer.parseInt(st.nextToken());
            medal[i][3] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(medal, (a,b)->{
            if(a[1]!=b[1]) return a[1] - b[1];
            if(a[2]!=b[2]) return a[2] - b[2];
            return a[3] - b[3];
        });

        int prize=1;
        int g=medal[0][1], s=medal[0][2], b=medal[0][3];
        for(int i=0; i<N; i++){
            if(medal[i][0]==K){
                bw.write(prize + "");
                break;
            }
            if(medal[i][1]!=g ||medal[i][2]!=s||medal[i][3]!=b){
                prize++;
                g=medal[i][1];
                s=medal[i][2];
                b=medal[i][3];
            }
        }

        bw.flush();
    }
}
