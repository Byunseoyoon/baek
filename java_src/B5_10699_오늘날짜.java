package java_src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class B5_10699_오늘날짜 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        System.out.println(now.format(formatter));
    }
}
