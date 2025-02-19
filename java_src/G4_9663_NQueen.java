package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G4_9663_NQueen {
    private static int N;
    private static boolean[] column, diagonal1, diagonal2;
    private static int cnt;

    static void back(int row){
        if(row==N) {
            cnt++;
            return;
        }

        for(int col=0; col<N; col++) {
            if(column[col] || diagonal1[row+col] || diagonal2[row-col+(N-1)]) continue;

            column[col]=diagonal1[row+col]=diagonal2[row-col+(N-1)]=true;
            back(row+1);
            column[col]=diagonal1[row+col]=diagonal2[row-col+(N-1)]=false;
        }
    }



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        cnt=0;
        column = new boolean[N];
        diagonal1 = new boolean[2*N-1]; // / 방향 대각선
        diagonal2 = new boolean[2*N-1]; // \ 방향 대각선
        back(0);
        System.out.println(cnt);
    }
}
