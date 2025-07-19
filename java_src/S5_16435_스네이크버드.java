package java_src;

import java.io.*;
import java.util.*;

public class S5_16435_스네이크버드 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] fruits = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++)
            fruits[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(fruits);
        for(int f: fruits){
            if(f<=L) L++;
            else break;
        }
        bw.write(L+"");
        bw.flush();

    }
}
