package java_src;

import java.io.*;
import java.util.*;

public class S3_20920_영단어암기는괴로워 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> words = new HashMap<>();
        while(N-->0){
            String word = br.readLine();
            if(word.length()<M) continue;
            int cnt = words.getOrDefault(word, 0)+1;
            words.put(word, cnt);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
        list.sort((a,b)->{
            if(a.getValue()!=b.getValue())
                return b.getValue() - a.getValue();
            else if(b.getKey().length() != a.getKey().length())
                return b.getKey().length() - a.getKey().length();
            return a.getKey().compareTo(b.getKey());
        });

        for(Map.Entry<String, Integer> e: list)
            bw.write(e.getKey() + "\n");

        bw.flush();



    }
}
