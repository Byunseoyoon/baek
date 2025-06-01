package java_src;

import java.io.*;
import java.util.*;

public class S4_11656_접미사배열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = new String[str.length()];
        for(int i=0;i<str.length(); i++){
            arr[i] = str.substring(i);
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(String s: arr)
            sb.append(s).append("\n");

        System.out.println(sb);
    }
}
