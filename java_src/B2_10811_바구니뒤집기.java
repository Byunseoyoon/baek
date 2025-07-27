package java_src;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B2_10811_바구니뒤집기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new  StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        while(M-->0){
            st = new  StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            while(i<j){
                int tmp  = arr[i-1];
                arr[i-1] = arr[j-1];
                arr[j-1] = tmp;
                i++;
                j--;
            }
        }
        for(int x:arr){
            bw.write(x+ " ");
        }

        bw.flush();
    }
}
