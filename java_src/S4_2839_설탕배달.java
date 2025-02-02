package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class S4_2839_설탕배달 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt5=0;
        int cnt3=0;

        cnt5 = N/5 ;
        cnt3 = (N%5)/3;

        if(N%5%3!=0)
            while(true){
                if (cnt5!=0) cnt5--;
                if((N-cnt5*5)%3==0) {
                    cnt3 = (N - cnt5 * 5) / 3;
                    System.out.println(cnt3+cnt5);
                    break;
                }else if(cnt5<=0){
                    System.out.println("-1");
                    break;
                }
            }
        else System.out.println(cnt3+cnt5);


    }

}
