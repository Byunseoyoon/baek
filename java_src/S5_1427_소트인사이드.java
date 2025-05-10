package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class S5_1427_소트인사이드 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Integer[] arr = new Integer[str.length()];
        for(int i=0; i<str.length();i++){
            arr[i] = Integer.parseInt(str.charAt(i)+"");
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int x : arr)
            System.out.print(x);


    }
}
