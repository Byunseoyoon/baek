package java_src;

import java.io.*;
import java.util.*;

public class B2_1978_소수찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st =new  StringTokenizer(br.readLine());

        int max = 1;
        int[] in = new int[N];

        for(int i=0; i<N; i++){
            in[i] = Integer.parseInt(st.nextToken());
            max= Math.max(in[i], max);
        }

        boolean[] isPrime= new boolean[max+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i=2; i*i<= max; i++){
            if(!isPrime[i]) continue;
            for(int j=i*i; j<=max; j+=i)
                isPrime[j] = false;
        }

        int count=0;
        for(int x:in)
            if(isPrime[x]) count++;
        System.out.println(count);


    }
}
