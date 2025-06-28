package java_src;

import java.io.*;
import java.util.*;

public class S2_1965_상자넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // -----------------dp 방법 -----------
//        int[] dp =new int[n];   // 해당 배열에서 최대 갯수?
//        int max=0;
//        for(int i=1; i<n; i++){
//            for(int j=0; j<i; j++){
//                if(arr[j] <arr[i]) dp[i] = Math.max(dp[i], dp[j]+1);
//            }
//            max = Math.max(max, dp[i]);
//        }
//        bw.write(max+1+"\n");


        //   --- 이분 탐색 방법
        List<Integer> list = new ArrayList<>();
        for(int box: arr){
            int pos = Collections.binarySearch(list, box);
            if(pos<0) pos = -pos -1;

            if(pos==list.size()) list.add(box);
            else list.set(pos, box);
        }

        bw.write(list.size()+"");
        bw.flush();
    }
}
