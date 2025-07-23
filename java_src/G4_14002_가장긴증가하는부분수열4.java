package java_src;

import java.io.*;
import java.util.*;

public class G4_14002_가장긴증가하는부분수열4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[A];
        String[] list = new String[A];
        for(int i=0;i<A; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            list[i] = arr[i]+"";
        }

        int[] dp = new int[A];
        Arrays.fill(dp, 1);

        for(int i=0; i<A; i++){
            for(int j=0; j<i; j++)
                if(arr[i] > arr[j] && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                    list[i] = list[j]+" "+arr[i];
                }
        }

        int idx=0;
        for(int i=1; i<A; i++){
            if(dp[i]> dp[idx]) idx = i;
        }

        bw.write(dp[idx]+"\n");
        bw.write(list[idx]);
        bw.flush();
    }
}
