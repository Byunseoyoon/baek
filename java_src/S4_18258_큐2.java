package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S4_18258_큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Integer last =-1;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch(order){
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
                    break;
                case "pop":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    if(queue.isEmpty()) sb.append("0").append("\n");
                    else sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
