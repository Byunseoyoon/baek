package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Print implements Comparable<Print>{
    int order;
    int priority;

    public Print(int order, int priority){
        this.order = order;
        this.priority = priority;
    }

    @Override
    public int compareTo(Print p){
        return this.priority-p.priority;
    }
}

public class S3_1966_프린터큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int in = Integer.parseInt(br.readLine());       // 초기 입력되어 있는 문자열

        for (int i = 0; i < in; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            Queue<Print> q = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2)->p2-p1);

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int priority = Integer.parseInt(st.nextToken());
                q.offer(new Print(j, priority));
                pq.offer(priority);
            }

            int count = 0;

            while (!q.isEmpty()) {
                Print current = q.poll();
                if(current.priority == pq.peek()){
                    pq.poll();
                    count++;
                    if(current.order==M){
                        sb.append(count).append("\n");
                        break;
                    }
                }else{
                    q.offer(current);
                }
            }
        }
        System.out.println(sb);
    }
}
