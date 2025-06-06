package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_21921_블로그 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum=0;
        for(int i=0;i<X;i++)
            sum+=arr[i];

        int max=sum, count=1;

        // 슬라이딩 윈도우
        for(int i=X; i<N; i++){
            sum= sum-arr[i-X]+arr[i];
            if(max==sum) count++;
            else if(max<sum){
                count=1;
                max=sum;
            }
        }

        System.out.println(max==0? "SAD" : max+"\n"+count);
    }
}
