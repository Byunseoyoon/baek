package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class S3_1002_터렛 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(func(x1, y1, r1, x2, y2, r2)).append("\n");
        }
        System.out.println(sb);
    }
    private static int func(int x1, int y1,int r1, int x2, int y2, int r2){
        int dis_pow = (int)(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); // 중점 거리 제곱

        // 아예 똑같은 경우
        if(x1==x2 && y1==y2 && r1==r2) return -1;

        // 속해있을때, 두점사이거리가 반지름 합보다 클 때
        else if(dis_pow > Math.pow(r1+ r2, 2) || dis_pow < Math.pow(r1- r2, 2) ) return 0;

        //외접 or 내접 할 때
        else if(dis_pow == Math.pow(r1+ r2, 2) || dis_pow == Math.pow(r1- r2, 2)) return 1;

        else return 2;
    }

}
