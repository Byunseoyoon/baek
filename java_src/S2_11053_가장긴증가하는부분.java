package java_src;

import java.io.*;
import java.util.*;

public class S2_11053_가장긴증가하는부분 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[A+1];    //dp[i] = arr[i]를 마지막 원소로 하는 가장 긴 증가하는 부분 수열의 길이
        Arrays.fill(dp, 1);
        for(int i=0; i<A; i++){
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }

        int result=0;
        for(int x: dp)
            result = Math.max(result, x);

        bw.write(result+"");
        bw.flush();
    }
}
