package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_14681_사분면고르기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        int out=0;
        if(X>0){
            if(Y>0) out=1;
            else out=4;
        }else{
            if(Y>0) out=2;
            else out=3;
        }

        System.out.println(out);
    }
}
