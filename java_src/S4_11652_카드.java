package java_src;

import java.io.*;
import java.util.*;

public class S4_11652_카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();

        long answer =0;
        int max=0;

        for(int i=0; i<N; i++){
            long x = Long.parseLong(br.readLine());
            int cnt = map.getOrDefault(x, 0)+1;
            map.put(x, cnt);

            if(cnt> max){
                max = cnt;
                answer =x;
            }else if(cnt ==max && x<answer) answer=x;
        }

//        List<Map.Entry<Long, Integer>> enList = new ArrayList<>(map.entrySet());
//        enList.sort((e1, e2)->{
//            if(!e1.getValue().equals(e2.getValue()))
//                return e2.getValue() - e1.getValue();   // value 내림
//            else return Long.compare(e1.getKey() , e2.getKey());  // key 오름차순
//        });
//        bw.write(enList.get(0).getKey()+"");

        bw.write(answer+"");
        bw.flush();
    }
}
