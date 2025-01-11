package java_src;

import java.io.*;
import java.util.*;

public class B2_2750_수정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            arr.add(x);
        }

        Collections.sort(arr);
        for(Integer x: arr){
            System.out.println(x);
        }
    }
}
