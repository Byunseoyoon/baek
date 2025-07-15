package java_src;

import java.io.*;
import java.util.*;

public class S4_1302_베스트셀러 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        while(N-->0){
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0)+1);
        }

        List<Map.Entry> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
           if(a.getValue()==b.getValue())
               return a.getKey().toString().compareTo(b.getKey().toString());
           return Integer.parseInt(b.getValue().toString()) -Integer.parseInt(a.getValue().toString());
        });

        bw.write(list.get(0).getKey()+"");
        bw.flush();

    }
}