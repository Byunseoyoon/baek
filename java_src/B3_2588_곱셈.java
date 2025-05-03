package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3_2588_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x= Integer.parseInt(br.readLine());
        String y= br.readLine();

        sb.append(x* Integer.parseInt(y.charAt(2)+"")).append("\n");
        sb.append(x* Integer.parseInt(y.charAt(1)+"")).append("\n");
        sb.append(x* Integer.parseInt(y.charAt(0)+"")).append("\n");
        sb.append(x* Integer.parseInt(y)).append("\n");

        System.out.println(sb);

    }
}
