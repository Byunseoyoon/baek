package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_1158_요세푸스문제 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> q = new ArrayList<>();

        for(int i=0; i<N; i++){
            q.add(i+1);
        }

        int index = K-1;

        sb.append("<");

        while(q.size()>1){
            sb.append(q.get(index)).append(", ");
            q.remove(index);

            index = (index+K-1) % q.size();
        }

        sb.append(q.get(0)).append(">");
        System.out.println(sb);
    }
}