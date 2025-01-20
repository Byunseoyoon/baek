package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_1026_보물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());       // 초기 입력되어 있는 문자열
        int[] A = new int[N];
        List<Integer> B = new ArrayList<>();

        StringTokenizer sb = new StringTokenizer(br.readLine());
        StringTokenizer sb2 = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++){
            A[i] = Integer.parseInt(sb.nextToken());
            B.add(Integer.parseInt(sb2.nextToken()));
        }

        Arrays.sort(A);
        int total = 0;
        for(int i =N-1 ; i>-1; i--){
            int min_index = i;
            for(int j =0; j<B.size(); j++){
                if(B.get(min_index) >  B.get(j))
                    min_index = j;
            }
             total += A[i] * B.remove(min_index);
        }

        System.out.println(total);

    }
}
