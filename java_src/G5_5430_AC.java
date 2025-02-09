package java_src;

import java.io.*;
import java.util.*;
public class G5_5430_AC {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String p = br.readLine();

            // 덱에 배열 저장
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> dq = new ArrayDeque<>();
            String order = br.readLine();
            String[] arr = order.replaceAll("\\[", "").replaceAll("]", "").split(",");
            for(int j=0; j<n; j++){
                dq.add(Integer.parseInt(arr[j]));
            }

            boolean isError = false;
            boolean isReverse = false;
            for(int j=0; j<p.length(); j++){
                switch(p.charAt(j)){
                    case 'R':
                        isReverse = !isReverse;
                        break;
                    case 'D':
                        if(!(dq.isEmpty())){
                            if(isReverse)
                                dq.pollLast();
                            else
                                dq.pollFirst();
                        }else isError = true;
                        break;
                }
                if(isError){
                    sb.append("error").append("\n");
                    break;
                }
            }

            if (!isError){
                sb.append("[");
                while( dq.size() >0) {
                    if(isReverse) sb.append(dq.pollLast());
                    else sb.append(dq.pollFirst());

                    if(dq.size() > 0)  sb.append(",");
                }

                sb.append("]").append("\n");
            }

        }

        System.out.println(sb);

    }
}
