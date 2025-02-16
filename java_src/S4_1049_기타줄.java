package java_src;

import java.io.*;
import java.util.*;

public class S4_1049_기타줄 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] pakage = new int[M];
        int[] single = new int[M];

        for(int i=0; i<M;i++) {
            st = new StringTokenizer(br.readLine());
            pakage[i] = Integer.parseInt(st.nextToken());
            single[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pakage);
        Arrays.sort(single);
        int min = single[0] * N;
        for(int i=1; i<=N; i++){
            int cnt = N - i * 6;
            int pay = pakage[0] * i;
            if(cnt >= 0)
                pay += cnt * single[0];

            if( pay < min)
                min = pay;
        }

        System.out.println(min);
    }
}