package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2_3052_나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mod = new int[42];

        int N=10;
        while(N-->0){
            int num = Integer.parseInt(br.readLine());
            mod[num%42]++;
        }

        int cnt=0;
        for(int x: mod){
            if(x!=0) cnt++;
        }

        System.out.println(cnt);
    }
}
