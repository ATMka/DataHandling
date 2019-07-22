package differenceDate.service;

import differenceDate.entity.ExportDateName;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateService {
    public long differenceBirthdayDateAndNowDate (String birthdayDate, ExportDateName exportDateName) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime birthdayDatePars;
        try {
            birthdayDatePars = LocalDateTime.of(LocalDate.parse(birthdayDate,pattern), LocalTime.NOON);
        }
        catch (DateTimeParseException e){
            birthdayDatePars = LocalDateTime.now();
        }

        Duration duration = Duration.between(birthdayDatePars,LocalDateTime.now());
        switch (exportDateName.getName()){
            case "секунды":
                return duration.getSeconds();
            case "минуты":
                return duration.toMinutes();
            case "часы":
                return duration.toHours();
            case "дни":
                return duration.toDays();
            case "месяцы":
                Period period = Period.between(birthdayDatePars.toLocalDate(),LocalDate.now());
                return period.getYears() * 12 + period.getMonths();
            default:
                return 0;
        }
    }
}
