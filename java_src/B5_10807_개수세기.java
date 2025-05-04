package java_src;

import java.io.*;
import java.util.*;

public class B5_10807_개수세기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[input];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<input;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());
        int cnt=0;
        for(int x: arr){
            if(x==v) cnt++;
        }

        System.out.println(cnt);
    }
}
