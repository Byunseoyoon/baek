package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_1764_듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> noListen = new HashSet<>();
        List<String> result = new ArrayList<>();

        for(int i=0;i<N;i++)
            noListen.add(br.readLine());

        for(int i=0;i<M;i++){
            String name=br.readLine();
            if(noListen.contains(name))
                result.add(name);
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for(String name: result)
            sb.append(name).append("\n");

        System.out.print(sb);
    }
}
