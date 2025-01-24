package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1_2869_달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V-B) /(A-B);
        if((V-B) % (A-B)!=0) day++;
        System.out.println(day);
    }
}
