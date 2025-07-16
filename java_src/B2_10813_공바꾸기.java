package java_src;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B2_10813_공바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new  StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for(int i=0;i<N;i++){
            basket[i] = i+1;
        }

        while(M-->0){
            st =new  StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = tmp;
        }

        for(int x: basket){
            bw.write(x+" ");
        }
        bw.flush();
    }
}
