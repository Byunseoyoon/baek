package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3_4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[] {
                Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
            };

            if(arr[0]==0 &&arr[1]==0 && arr[2]==0)
                break;
            Arrays.sort(arr);
            if(Math.pow(arr[2],2) == (Math.pow(arr[0],2) + Math.pow(arr[1],2)))
                sb.append("right").append("\n");
            else
                sb.append("wrong").append("\n");
        }

        System.out.println(sb);

    }
}
