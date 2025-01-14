package java_src;

import java.io.*;
import java.util.Arrays;

public class B1_10989_수정렬하기3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0;i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int x : arr){
            sb.append(x).append("\n");
        }

        System.out.println(sb);
    }
}
