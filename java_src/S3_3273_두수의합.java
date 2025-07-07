package java_src;

import java.io.*;
import java.util.*;

public class S3_3273_두수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++)
            arr[i] =Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());
        int i=0, j=n-1;
        int cnt = 0;

        while(i<j){
            if( arr[i]+arr[j]==x){
                cnt++;
                i++;
                j--;
            }else if(arr[i]+arr[j] >x) j--;
            else if(arr[i]+arr[j] < x) i++;
        }

        bw.write(cnt+"");
        bw.flush();
    }
}
