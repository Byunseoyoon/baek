package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S4_11047_동전0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] cent = new int[N];
        for(int i=0;i<N;i++)
            cent[i] = Integer.parseInt(br.readLine());

        int count=0;
        for(int i=N-1; i>=0; i--){
            if(K==0) break;
            if(K >= cent[i]){
                count += K / cent[i];
                K %= cent[i];
            }
        }

        System.out.print(count);
    }
}
