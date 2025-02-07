package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class S2_1182_부분수열의합 {
    private static int[] arr;
    private static int N;
    private static int S;
    private static int cnt;
    private static void dfs(int index, int sum){
        if(index==N){
            if(sum==S) cnt++;
        }else{
            // 현재 인덱스 포함 하는 경우
            dfs(index+1, arr[index]+sum);
            // 포함하지 않는 경우
            dfs(index+1, sum);
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        cnt=0;
        dfs(0,0);
        System.out.println(S==0? cnt-1: cnt);
    }
}
