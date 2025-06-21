package java_src;

import java.io.*;
import java.util.*;

public class B3_2562_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=1;
        int max=0, index =-1;
        while(n++<=9){
            int num = Integer.parseInt(br.readLine());
            max = Math.max(max, num);
            if(max==num) index = n-1;
        }
        bw.write(max+"\n");
        bw.write(index+"");
        bw.flush();
    }
}
