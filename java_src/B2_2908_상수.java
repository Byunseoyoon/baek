package java_src;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2_2908_상수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new  StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        bw.write(Math.max(Integer.parseInt(""+A.charAt(2)+A.charAt(1)+A.charAt(0)), Integer.parseInt(""+B.charAt(2)+B.charAt(1)+B.charAt(0)))+"");
        bw.flush();

    }
}
