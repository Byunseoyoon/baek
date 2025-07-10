package java_src;

import java.io.*;
import java.util.*;

public class S4_2003_수들의합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i=0, j=0, cnt=0, sum=0;

        while(true){
            if(sum>=M){
                sum-=arr[i++];
            }else if(j==N) break;
            else{
                sum += arr[j++];
            }
            if(sum==M) cnt++;
        }

        bw.write(cnt + "");
        bw.flush();

    }
}
