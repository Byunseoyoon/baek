package java_src;

import java.io.*;
import java.util.StringTokenizer;

public class B1_1546_평균 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int max=0;
        for(int i=0; i<N; i++){
            arr[i] =Integer.parseInt(st.nextToken());
            max = Math.max(arr[i], max);
        }

        double sum =0;
        for(int x: arr)
            sum=(double)x/max*100+sum;
        System.out.println(sum/N);
    }
}
