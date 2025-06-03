package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min =1000000;
        int max = -1000000;

        for(int i = 0; i< N; i++){
            int curr = Integer.parseInt(st.nextToken());
            min = Math.min(min, curr);
            max = Math.max(max, curr);
        }

        System.out.println(min+" "+max);

    }
}
