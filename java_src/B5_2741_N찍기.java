package java_src;

import java.io.*;

public class B5_2741_N찍기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            System.out.println(i + 1);
        }
    }
}
