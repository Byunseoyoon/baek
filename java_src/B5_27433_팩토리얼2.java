package java_src;

import java.io.*;

public class B5_27433_팩토리얼2 {
    private static long factorial(long n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }
}
