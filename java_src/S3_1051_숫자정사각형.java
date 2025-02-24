package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S3_1051_숫자정사각형 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] square = new int[N][M];
        for(int i=0; i<N;i++){
            String in = br.readLine();
            for(int j=0; j<M;j++){
                square[i][j] = Integer.parseInt(in.charAt(j)+"");
            }
        }

        int size=1;
        for(int i=0; i<N;i++){
            for(int j=0; j<M;j++){
                for(int k=1; i+k<N && j+k < M; k++){    //k 는 한 변의 길이
                    if(square[i][j]==square[i][k+j] && square[i][j]==square[k+i][j] && square[i][j]==square[k+i][k+j])
                        size = Math.max(size, (k+1)*(k+1));
                }
            }
        }

        System.out.println(size);
    }
}
