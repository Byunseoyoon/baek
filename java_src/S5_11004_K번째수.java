package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S5_11004_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        //int[] arr = new int[N];

        List<Integer> arr = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            //arr[i] = sc.nextInt();
            arr.add(Integer.parseInt(st.nextToken()));
        }

        // Arrays.sort(arr);
        Collections.sort(arr);

//        System.out.println(arr[K-1]);
        System.out.println(arr.get(K-1));
    }
}