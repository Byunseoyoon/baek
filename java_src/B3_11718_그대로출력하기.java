package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_11718_그대로출력하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while((str = br.readLine())!=null && !str.isEmpty()){
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
