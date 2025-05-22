package java_src;

import java.io.*;
import java.util.*;

public class S2_18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] origin = new int[N];

        for (int i = 0; i < N; i++) {
            origin[i]=Integer.parseInt(st.nextToken());
        }

        int[] sorted = Arrays.copyOf(origin, N);
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int order =0;
        for(int x: sorted){
            if(!map.containsKey(x))
                map.put(x, order++);
        }

        for(int x: origin)
            sb.append(map.get(x)).append(" ");

        System.out.println(sb);

    }
}
