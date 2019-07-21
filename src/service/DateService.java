package service;

import entity.ExportDateName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateService {
    public int differenceBirthdayDateAndNowDate (String birthdayDate, ExportDateName exportDateName) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthdayDatePars;
        try {
            birthdayDatePars = LocalDate.parse(birthdayDate,pattern);
        }
        catch (DateTimeParseException e){
            birthdayDatePars = LocalDate.now();
        }
        Period period = birthdayDatePars.until(LocalDate.now());
        switch (exportDateName.getName()){
            case "секунды":
                return period.getDays() * 24 * 60 * 60;
            case "минуты":
                return period.getDays() * 24 * 60;
            case "часы":
                return period.getDays() * 24;
            case "дни":
                return period.getDays();
            case "месяцы":
                return period.getMonths();
            default:
                return 0;
        }
    }
}
