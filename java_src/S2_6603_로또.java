package java_src;

import java.io.*;
import java.util.*;

public class S2_6603_로또 {
    private static int[] select, arr;
    private static int k;
    private static StringBuilder sb;

    private static void back(int depth, int start){
        if(depth==6){
            for(int x: select)
                sb.append(x).append(" ");
            sb.append("\n");
            return;
        }
        for(int i=start; i<k; i ++){
            select[depth] = arr[i];
            back(depth + 1, i + 1);
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k==0) break;

            arr = new int[k];
            select = new int[6];

            for(int i=0;i<k;i++)
                arr[i] = Integer.parseInt(st.nextToken());

            back(0, 0);
            sb.append("\n");

        }
        System.out.println(sb);
    }


}
