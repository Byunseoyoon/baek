package java_src;

import java.io.*;
import java.util.*;

public class S5_9655_돌게임 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(N%2==0? "CY": "SK");
        bw.flush();

    }
}
