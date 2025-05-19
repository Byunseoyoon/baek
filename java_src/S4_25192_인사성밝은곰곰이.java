package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S4_25192_인사성밝은곰곰이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> names = new HashSet<>();
        int cnt= 0;
        for(int i=0; i<N;i++) {
            String str = br.readLine();
            if(str.equals("ENTER")){
                names.clear();
            }else if(!names.contains(str)){
                names.add(str);
                cnt++;
            }
        }


        System.out.println(cnt);

    }
}
