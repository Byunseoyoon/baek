package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class S4_28278_스택2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch(order){
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    sb.append(stack.isEmpty()? "-1": stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty()? "1": "0").append("\n");
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? "-1": stack.peek()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
