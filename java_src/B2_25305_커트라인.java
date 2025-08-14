package java_src;

import java.io.*;
import java.util.*;

public class B2_25305_커트라인 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new  StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        st =new  StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        bw.write(arr[K-1]+"");
        bw.flush();
    }
}
