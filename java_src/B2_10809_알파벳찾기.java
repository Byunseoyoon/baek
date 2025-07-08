package java_src;

import java.io.*;
import java.util.Arrays;

public class B2_10809_알파벳찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] AtoZ = new int[26];
        Arrays.fill(AtoZ,-1);
        String in = br.readLine();
        for(int i=0; i<in.length(); i++){
            int idx = in.charAt(i) -'a';
            if(AtoZ[idx]==-1)
                AtoZ[idx]=i;
        }
        for(int x: AtoZ)
            bw.write(x+" ");
        bw.flush();

    }
}
