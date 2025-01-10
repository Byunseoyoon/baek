package java_src;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S4_1920_수찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int x= Collections.binarySearch(arr, Integer.parseInt(st.nextToken())); // 이진 탐색 라이브러리
            if(x<0){    // 해당 값이 존재 하지 않는 다면 들어갈 위치 반환  -(index)-1 
                arr2[i]=0;
            }else{      //해당 값이 존재한다면, 해당 값의 index를 반환
                arr2[i]=1;
            }
        }

        for(int x:arr2){
            System.out.println(x);
        }

    }
}
