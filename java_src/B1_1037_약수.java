package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1_1037_약수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++)
            arr[i] =Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        System.out.println(arr[0]*arr[cnt-1]);
    }
}
