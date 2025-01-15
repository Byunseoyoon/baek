package java_src;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class S5_10815_숫자카드 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] user = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++) user[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(user);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M; i++) {
            if(Arrays.binarySearch(user, Integer.parseInt(st.nextToken()))<0) sb.append("0 ");
            else sb.append("1 ");
        }

        System.out.println(sb);
    }
}
