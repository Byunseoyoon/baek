package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class S3_15649_N과M1 {
    private static StringBuilder sb;
    private static boolean[] check;
    private static int[] arr;
    private static int N, M;

    static void back(int depth){
        if(depth==M){
            for(int x: arr)
                sb.append(x).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=1; i<N+1; i++){
            if (!check[i]) {
                check[i]=true;
                arr[depth]=i;
                back(depth + 1);
                check[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        check = new boolean[N+1];
        back(0);
        System.out.println(sb);
    }
}
