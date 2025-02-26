package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_3003_킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws IOException{
        final int[] arr = {1, 1, 2, 2, 2, 8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        StringBuilder sb =new StringBuilder();
        for(int x:arr){
            sb.append(x-Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb);
    }
}
