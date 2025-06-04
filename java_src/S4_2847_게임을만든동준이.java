package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_2847_게임을만든동준이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] point = new int[N];
        for(int i=0; i<N;i++)
            point[i] = Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=N-2; i>=0;i--){
            while(point[i]>=point[i+1]){
                point[i]--;
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}
