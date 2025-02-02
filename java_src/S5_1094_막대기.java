package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S5_1094_막대기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int stick = 64;
        int sum =64;
        int count=1;

        while(sum > X){
            stick /= 2;
            if(sum-stick >= X)
                sum -= stick;
            else
                count++;
        }

        System.out.println(count);

    }
}
