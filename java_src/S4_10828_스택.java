package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        List<Integer> print = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(order.equals("pop")){
                if(stack.isEmpty()){
                    print.add(-1);
                }else{
                    print.add(stack.pop());
                }
            }else if(order.equals("size")){
                print.add(stack.size());
            } else if(order.equals("empty")){
                print.add(stack.isEmpty()? 1:0 );
            }else if (order.equals("top")) {
                if(stack.isEmpty()){
                    print.add(-1);
                }else{
                    print.add(stack.peek());    //getlast
                }
            }
        }

        for(int i : print){
            System.out.println(i);
        }
    }
}
