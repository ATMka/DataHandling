package formatDate.service;

import java.time.format.DateTimeFormatter;

public class Demo {
    public void go(){
        String date = "Friday, Aug 12, 2016 12:10:56 PM";
        System.out.println(DemoService.stringToDate(date));
    }
}
