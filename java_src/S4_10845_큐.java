package java_src;

import java.io.*;
import java.util.*;

public class S4_10845_큐 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        int last = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch(order){
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    q.offer(last);
                    // 큐 용량 초과 시 add() -> 예외 발생 / offer() -> false 리턴
                    break;
                case "pop":
                    if(!q.isEmpty()) sb.append(q.poll()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "size":
                    if(!q.isEmpty()) sb.append(q.size()).append("\n");
                    else sb.append("0\n");
                    break;
                case "empty":
                    if(q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if(!q.isEmpty()) sb.append(q.peek()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "back":
                    if(!q.isEmpty()) sb.append(last).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}