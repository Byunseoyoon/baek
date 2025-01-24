package java_src;

import java.io.*;
import java.util.*;
public class S5_10867_중복빼고정렬하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n;i++)
            set.add(Integer.parseInt(st.nextToken()));

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int x: list){
            System.out.print(x+" ");
        }

    }
}
