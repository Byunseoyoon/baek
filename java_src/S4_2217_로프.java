package java_src;

import java.io.*;
import java.util.*;

public class S4_2217_로프 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        Integer[] ropes = new Integer[input];

        for (int i = 0; i < input; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes, Collections.reverseOrder());

        int i=0, max=0;
        for(int rope: ropes){
            max= Math.max(max, rope*(i+1));
            i++;
        }

        System.out.println(max);
    }
}
