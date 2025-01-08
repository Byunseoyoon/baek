package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class S5_11651_좌표정렬하기2 {
    static class Coordinate{
        int x,y;
        Coordinate(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Coordinate> arr = new ArrayList<Coordinate>();
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr.add(new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        arr.sort( Comparator.comparingInt(a->a.x));
        arr.sort( Comparator.comparingInt(a->a.y));
        for(Coordinate c: arr){
            System.out.println(c.x+" "+c.y);
        }
    }
}
