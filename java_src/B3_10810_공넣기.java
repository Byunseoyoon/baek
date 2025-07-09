package java_src;

import java.io.*;
import java.util.StringTokenizer;

public class B3_10810_공넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int arr[] = new int[N ];
        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            for(int s =i-1;s<j; s++ ){
                arr[s] = k;
            }
        }
        for(int x: arr)
            bw.write(x+" ");
        bw.flush();
    }
}
