package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class S3_2559_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] num = new int[N];
        for(int i=0;i<N;i++)
            num[i]= Integer.parseInt(st.nextToken());

        int sum =0;
        for(int i=0;i<K;i++)
            sum+=num[i];

        int max=sum;
        for(int i=K;i<N;i++){
            sum=sum-num[i-K]+num[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }


}
