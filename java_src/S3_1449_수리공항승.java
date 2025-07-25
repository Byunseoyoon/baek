package java_src;

import java.io.*;
import java.util.*;

public class S3_1449_수리공항승 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] holes = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            holes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(holes);
        double tape = holes[0]-0.5 + L;
        int cnt =1;
        for(int x: holes){
            if(x+0.5>tape){
                tape = x-0.5+L;
                cnt++;
            }
        }
        bw.write(cnt+"");
        bw.flush();
    }
}
