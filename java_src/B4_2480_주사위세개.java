package java_src;

import java.io.*;
import java.util.*;

public class B4_2480_주사위세개 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        if(x==y && x==z) bw.write(10000+x*1000+""); // 셋다 같은 경우
        else if (x==y || x==z) bw.write(1000+x*100+"");
        else if(y==z) bw.write(1000+y*100+"");
        else bw.write(Math.max(x,Math.max(y, z))*100+"");

        bw.flush();
        bw.close();
    }
}
