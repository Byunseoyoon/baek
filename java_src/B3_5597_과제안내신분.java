package java_src;

import java.io.*;

public class B3_5597_과제안내신분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=28;
        boolean[] check = new boolean[31];
        while(n-->0){
            int num = Integer.parseInt(br.readLine());
            check[num] = true;
        }

        for(int i=1;i<31; i++)
            if(!check[i]) bw.write(i+"\n");

        bw.flush();
    }
}
