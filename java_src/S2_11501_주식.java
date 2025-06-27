package java_src;

import java.io.*;
import java.util.*;

public class S2_11501_주식 {
    private static long benefit(int[] arr){
        int max=0;
        long sum=0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>max){
                max=arr[i];
            }else{
                sum+= max-arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr= new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            bw.write(benefit(arr)+"\n");
        }
        bw.flush();
    }
}
