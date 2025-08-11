package java_src;

import java.io.*;
import java.util.*;

public class S3_11478_서로다른부분문자열의개수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        Set<String> set = new HashSet<>();

        int cnt=0;
        int length = input.length()+1;
        while(length-->1){
            for(int i=0; i+length<=input.length(); i++)
                set.add(input.substring(i, length+i));
        }
        bw.write(set.size()+"");
        bw.flush();
    }
}
