package java_src;

import java.io.*;
import java.util.*;

class Quiz {
    int order;
    int point;

    public Quiz(int o, int p){
        this.order = o;
        this.point=p;
    }
}

public class S5_2822_점수계산 {
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Quiz[] points = new Quiz[8];
        for(int i=0; i<8; i++){
            points[i] = new Quiz(i+1, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(points, (a,b)->b.point-a.point);
        Arrays.sort(points, 0, 5, (a,b)->a.order - b.order);
        int sum =0;

        for(int i=0; i<5; i++){
            sum += points[i].point;
            sb.append(points[i].order).append(" ");
        }

        bw.write(sum+"\n");
        bw.write(sb+"");

        bw.flush();
    }
}
