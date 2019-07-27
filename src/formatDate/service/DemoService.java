package formatDate.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DemoService {
    public static ZonedDateTime stringToDate(String text){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy h:m:s a").withLocale(Locale.ENGLISH);
        LocalDateTime dateTime = LocalDateTime.parse(text,pattern);
        return ZonedDateTime.of(dateTime, ZoneId.of("+04:00:00"));
    }
}
