package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1316_그룹단어체커 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total =0;
        for(int j=0;j<N;j++){
            boolean[] isUse = new boolean[26];
            String word = br.readLine();
            char pre = 0;
            boolean isGroup = true;

            for(int i=0; i<word.length();i++){
               char curr = word.charAt(i);
               if(curr !=pre){// 이전과 다른 단어 인 경우
                   if(isUse[curr-'a']) {  // 이미 다른 곳에서 사용한 경우
                       isGroup = false;
                       break;
                   }
                   isUse[curr-'a'] = true;
                   pre = curr;
               }
            }
            if(isGroup) total++;
        }
        System.out.println(total);
    }
}
