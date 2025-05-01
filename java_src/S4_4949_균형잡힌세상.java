package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_4949_균형잡힌세상 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str.charAt(0)=='.') break;
            Stack<Character> sen = new Stack<>();
            for(int i=0;i<str.length();i++){
                char x = str.charAt(i);
                if(x=='.'){
                    sb.append(sen.isEmpty()? "yes": "no").append("\n");
                    break;
                }else if(x=='(' || x=='['){
                    sen.add(x);
                }else if(x==')'){
                    if(sen.isEmpty() || sen.peek()!='('){
                            sb.append("no").append("\n");
                        break;
                    }else
                        sen.pop();
                }else if(x==']'){
                    if(sen.isEmpty() || sen.peek()!='['){
                        sb.append("no").append("\n");
                        break;
                    }else
                        sen.pop();
                }
            }
        }
        System.out.println(sb);
    }
}