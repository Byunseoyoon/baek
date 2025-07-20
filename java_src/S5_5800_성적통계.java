package java_src;

import java.io.*;
import java.util.*;

public class S5_5800_성적통계 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] classes = new int[N][];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            classes[i]= new int[num];
            for(int j = 0; j< num; j++){
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i=0; i<N; i++) {
            Arrays.sort(classes[i]);
            int max = classes[i][classes[i].length-1];
            int min = classes[i][0];
            int gap=0;

            for(int j=classes[i].length-1; j>0; j--)
               gap = Math.max(gap, classes[i][j] -classes[i][j-1]);

            bw.write("Class " + (i + 1) + "\n");
            bw.write("Max "+ max+", ");
            bw.write("Min "+min +", ");
            bw.write("Largest gap "+gap+"\n");
        }
        bw.flush();
    }
}
