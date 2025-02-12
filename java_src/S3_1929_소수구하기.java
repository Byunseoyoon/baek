package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class S3_1929_소수구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(!isPrime[i]) continue;
            for(int j=i+i;j<=N;j+=i)
                isPrime[j] = false;
        }

        for (int i = M; i <= N; i++)
            if(isPrime[i])
                sb.append(i).append("\n");

        System.out.println(sb);
    }


}
