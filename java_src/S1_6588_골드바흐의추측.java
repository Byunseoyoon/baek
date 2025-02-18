package java_src;

import java.io.*;
import java.util.*;

public class S1_6588_골드바흐의추측 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int max=-1;
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            list.add(n);
            if(n>max) max=n;
        }

        max=max-2; // 어차피 합은 3부터 계산하니까 제일 큰값의 -3 한 사이즈만 필요
        boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);
        isPrime[0] =isPrime[1] = false;

        for(int i=2; i * i < max;i++){
            if(!isPrime[i]) continue;
            for(int j=i * i; j< max;j+=i ){
                if(isPrime[j]) isPrime[j] = false;
            }
        }

        for (int n : list) {
            boolean check = false;
            for (int j = 3; j <= n/2; j+=2) {
                if (isPrime[j] && isPrime[n - j]) {
                    sb.append(n).append(" = ").append(j).append(" + ").append(n - j).append("\n");
                    check = true;
                    break;
                }
            }
            if (!check) sb.append("Goldbach's conjecture is wrong.\n");
        }


        System.out.println(sb);
    }
}
