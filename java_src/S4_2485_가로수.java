package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S4_2485_가로수 {
    private static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<N; i++)
            list.add( Integer.parseInt(br.readLine()));

        int gcd = list.get(1)- list.get(0);
        for(int i=2; i<N; i++){
            gcd = GCD(gcd, list.get(i) - list.get(i-1));
        }

        int cnt=0;
        for (int i=1; i<N ;i++)
            cnt += (list.get(i) -list.get(i-1))/gcd-1;

        System.out.println(cnt);


    }
}
