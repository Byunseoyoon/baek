package java_src;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class S4_1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int i=0, j=N-1, cnt=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum>M) j--;
            else if(sum<M) i++;
            else {
                cnt++;
                i++;
                j--;
            }
        }
        bw.write(cnt+"");
        bw.flush();

    }
}
