package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_10866_덱 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push_front":
                    dq.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    Integer pop_f =dq.pollFirst();
                    if(pop_f ==null) sb.append("-1").append("\n");
                    else sb.append(pop_f).append("\n");
                    break;
                case "pop_back":
                    Integer pop_b =dq.pollLast();
                    if(pop_b == null) sb.append("-1").append("\n");
                    else sb.append(pop_b).append("\n");
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty":
                    if(dq.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    Integer peek_f = dq.peekFirst();
                    if(peek_f==null) sb.append("-1").append("\n");
                    else sb.append(peek_f).append("\n");
                    break;
                case "back":
                    Integer peek_b = dq.peekLast();
                    if(peek_b==null) sb.append("-1").append("\n");
                    else sb.append(peek_b).append("\n");
                    break;
            }
        }

        System.out.println(sb);

    }

}
