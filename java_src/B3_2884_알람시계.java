package java_src;

import java.io.*;
import java.util.StringTokenizer;

public class B3_2884_알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M<45){
            M = 15+M;
            H = H==0 ? 23 : H-1;
        }else{
            M = M-45;
        }

        bw.write(H+" "+M);
        bw.flush();
    }
}
