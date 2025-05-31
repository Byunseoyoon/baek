package java_src;

import java.io.*;
import java.util.*;

public class S3_12789_도키도키간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> line = new LinkedList<>();
        for(int i=0;i<N;i++)
            line.offer(Integer.parseInt(st.nextToken()));

        int order =1;
        Stack<Integer> wait = new Stack<>();
        while(!line.isEmpty()){
            int curr = line.poll();
            if(curr!=order) wait.push(curr);
            else order++;

            while(!wait.isEmpty()){
                if (wait.peek() != order) break;
                wait.pop();
                order++;
            }
        }

        bw.write(wait.isEmpty()? "Nice" :"Sad");
        bw.flush();
        bw.close();


    }

}
