package daysBetweenDates.service;

import differenceDate.entity.ExportDateName;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateService {
    public long daysBetweenDates(String firstDate, String secondDate) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime firstDatePars;
        LocalDateTime secondDatePars;
        try {
            firstDatePars = LocalDateTime.of(LocalDate.parse(firstDate, pattern), LocalTime.MIN);
            secondDatePars = LocalDateTime.of(LocalDate.parse(secondDate, pattern), LocalTime.MIN);
        } catch (DateTimeParseException e) {
            firstDatePars = null;
            secondDatePars = null;
        }

        return Duration.between(firstDatePars, secondDatePars).toDays();
    }
}
