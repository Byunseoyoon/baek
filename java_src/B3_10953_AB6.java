package java_src;

import java.io.*;
import java.util.*;

public class B3_10953_AB6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            String input = br.readLine();
            String[] result = input.split(",");
            int sum=0;
            for(String s:result)
                sum+= Integer.parseInt(s);

            bw.write(sum+"\n");
        }

        bw.flush();
    }
}
