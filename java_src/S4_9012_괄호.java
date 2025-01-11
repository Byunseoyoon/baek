package java_src;

import java.io.*;
import java.util.*;

public class S4_9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String line =br.readLine();
            Stack<Character> arr = new Stack<>();
            for(int j = 0; j < line.length(); j++){
                switch(line.charAt(j)){
                    case '(':
                        arr.push('(');
                        break;
                    case ')':
                        if(!arr.isEmpty() && arr.peek()=='(') arr.pop();    // peek()는 스택이 비어있을 때 호출하면 java.util.EmptyStackException을 던지도록 설계 없다고 해서 안나오는거 아님 ㅋ
                        else arr.push(')');
                        break;
                }
            }
            if(arr.isEmpty()){
                sb.append( "YES\n");
            }else{
                sb.append( "NO\n");
            }
        }

        System.out.print(sb);
    }
}
