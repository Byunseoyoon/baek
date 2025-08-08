package java_src;

import java.io.*;

public class B3_2720_세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T= Integer.parseInt(br.readLine());
        while(T-->0){
            int C= Integer.parseInt(br.readLine());
            bw.write(C/25 + " " + C%25/10+ " " + C%25%10/5 + " "+C%25%10%5+"\n");
        }

        bw.flush();
    }
}
