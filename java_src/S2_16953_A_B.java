package java_src;

import java.io.*;
import java.util.*;

public class S2_16953_A_B {
    static int bfs(long A, long B) {
        Queue<long[]> queue = new LinkedList<>();
        queue.offer(new long[]{A, 1});  // 시작 값과 연산 횟수(1 부터 시작)

        while(!queue.isEmpty()){
            long[] cur = queue.poll();
            long value = cur[0];    // 값
            int cnt = (int) cur[1];

            if(value==B) return cnt;

            if(value *2 <=B)
                queue.offer(new long[]{value*2, cnt+1});
            if(value*10 +1<=B)
                queue.offer(new long[]{value*10+1, cnt+1});
        }
        return -1;  // B에 도달 못함
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 기존 내 답 B->A 로 탐색하는 직관적 방법
//        int b= B;
//        int cnt =1;
//        while(b!=A){
//            if(b<A) {
//                cnt=-1;
//                break;
//            }else if(b%10==1){
//                b=b/10;
//                cnt++;
//            }else if(b%2==0) {
//                b=b/2;
//                cnt++;
//            }else{
//                cnt=-1;
//                break;
//            }
//        }

        bw.write(bfs(A,B)+"");
        bw.flush();
    }
}
