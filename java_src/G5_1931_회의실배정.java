package java_src;

import java.io.*;
import java.util.*;

class Time implements Comparable<Time>{
    int start;
    int end;
    public Time(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public int compareTo(Time t) {
        if(this.end==t.end)
            return this.start-t.start;
        return this.end -t.end;
    }
}
public class G5_1931_회의실배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Time> timeList = new ArrayList<>();
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            timeList.add(new Time(start, end));
        }

        Collections.sort(timeList);
        int cnt=0;
        int end=0;
        for(Time t : timeList){
            if(t.start>=end){
                cnt++;
                end=t.end;
            }
        }

        bw.write(cnt+"");
        bw.flush();
    }
}
