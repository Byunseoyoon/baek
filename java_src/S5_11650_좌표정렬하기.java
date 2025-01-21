package java_src;

import java.io.*;
import java.util.*;

public class S5_11650_좌표정렬하기 {
    static class Coordinate{
        private int x;
        private int y;

        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }

        public Coordinate(int x, int y){
            this.x= x;
            this.y= y;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Coordinate[] arr = new Coordinate[N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr,(c1, c2)-> {
            return Integer.compare(c1.getY(),  c2.getY());
        });

        Arrays.sort(arr,(c1, c2)-> {
            return Integer.compare(c1.getX(),  c2.getX());
        });


        for(int i=0; i<N; i++){
            System.out.println(arr[i].getX() + " " + arr[i].getY());
        }
    }
}
