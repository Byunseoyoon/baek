package java_src;

import java.io.*;
import java.util.*;

public class S2_2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[N];
        int sum=0;

        for(int i=0;i<N; i++){
            int input = Integer.parseInt(br.readLine());
            map.put(input, map.getOrDefault(input, 0)+1);
            arr[i] = input;
            sum+=input;
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            if(b.getValue()!=a.getValue())
                return b.getValue()-a.getValue();
            else return a.getKey() - b.getKey();
        });
        int freq = N>1 ? (list.get(0).getValue()==list.get(1).getValue() ? list.get(1).getKey(): list.get(0).getKey()) :list.get(0).getKey() ;

        Arrays.sort(arr);

        bw.write(Math.round((double)sum/N) + "\n");    // 산술 평균
        bw.write(  arr[arr.length/2]+ "\n");    // 중앙값
        bw.write(freq + "\n");    // 최빈값
        bw.write(arr[N-1] - arr[0]+ "\n");    // 범위
        bw.flush();
    }
}
