package java_src;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math){
        this.name =name;
        this.kor = kor;
        this.eng = eng;
        this.math =math;
    }

    @Override
    public int compareTo(Student s){
        if(this.kor!=s.kor)  return s.kor-this.kor;
        else if(this.eng!=s.eng)  return this.eng-s.eng;
        else if(this.math!=s.math)  return s.math-this.math;
        else return this.name.compareTo(s.name);
    }
}
public class S4_10825_국영수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);
        for(Student s: students)
            bw.write(s.name+"\n");
        bw.flush();
    }
}
