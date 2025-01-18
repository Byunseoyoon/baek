package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B2_8958_OX퀴즈 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String input = br.readLine();
            List<Integer> score = new ArrayList<>();
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j)=='O'){
                    if(score.isEmpty()) score.add(1);
                    else if(score.get(j-1)!=0)
                        score.add(score.get(j-1)+1);
                    else score.add(1);
                } else score.add(0);
            }

            int all=0;
            for(int x: score){
                all+=x;
            }
            sb.append(all).append("\n");
        }

        System.out.println(sb);


    }
}
