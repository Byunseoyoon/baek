package java_src;

import java.io.*;
import java.util.*;

public class S4_2164_카드2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=N;i++)
            q.offer(i);

        while(!q.isEmpty()){
            if(q.size()==1){
                System.out.println(q.poll());
                break;
            }
            q.poll();   // 버리고
            q.offer(q.poll());  // 밑으로 옮기기
        }
    }
}