package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S4_10816_숫자카드2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> user = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(user.containsKey(input))
                user.replace(input, user.get(input)+1 );
            else
                user.put(input, 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(user.containsKey(input) ? user.get(input) : "0").append(" ");
        }

        System.out.println(sb);
    }
}
