package java_src;

import java.io.*;
import java.util.*;

class Person{
    String name;
    int day, month, year;

    public Person(String name, int day, int month, int year){
        this.name= name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
public class S5_5635_생일 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];
        for(int i=0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            people[i] = new Person(name, day, month, year);
        }

        // 오름 차순 정렬
        Arrays.sort(people, (a,b)->{
            if(a.year !=b.year) return a.year-b.year;
            if(a.month !=b.month) return a.month-b.month;
            return a.day-b.day;
        });

        bw.write(people[n-1].name+"\n");
        bw.write(people[0].name);
        bw.flush();
    }
}
