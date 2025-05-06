package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2753_윤년 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        if((x%4==0 && x%100!=0) || x%400==0)
            System.out.print("1");
        else
            System.out.print("0");


    }
}
