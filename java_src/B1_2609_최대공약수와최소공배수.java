package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1_2609_최대공약수와최소공배수 {

    private static int getGCD(int a, int b){
        if(b==0) return  a;
        return getGCD(b, a%b);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new  StringTokenizer(br.readLine());

        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        int gcd = getGCD(N1, N2);
        int lcm = N1*N2/gcd;
        System.out.print(gcd+"\n"+ lcm);


    }
}
