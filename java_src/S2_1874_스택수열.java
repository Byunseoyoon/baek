package java_src;

import java.io.*;
import java.util.*;
public class S2_1874_스택수열 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> seq = new Stack<>();
        Queue<Integer> in = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            in.offer(Integer.parseInt(br.readLine()));
        }

        boolean isPossible = true;
        for(int i=1; !in.isEmpty(); ){
            int cur = in.peek();
            if(!seq.isEmpty() && seq.peek() >=cur ){
                sb.append("-").append("\n");
                if(cur == seq.pop()) in.poll();
            }else if(i> cur){
                isPossible = false;
                break;
            }else{
                sb.append("+").append("\n");
                seq.add(i);
                i++;
            }
        }

        System.out.println(isPossible ? sb : "NO");

    }
}
