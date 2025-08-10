package java_src;

import java.io.*;
import java.util.*;

public class S4_1822_차집합 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N =Integer.parseInt(st.nextToken());
        int K =Integer.parseInt(st.nextToken());
        Set<Long> A = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while(N-->0){
            A.add(Long.parseLong(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while(K-->0){
            long x =Long.parseLong(st.nextToken());
            A.remove(x);
        }
        List<Long> result = new ArrayList<>(A);
        Collections.sort(result);

        bw.write(A.size()+"\n");
        for(long x: result)
            bw.write(x+" ");
        bw.flush();
    }
}
