package service;

import entity.ExportDateName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {
    public Long differenceBirthdayDateAndNowDate (String birthdayDate, ExportDateName exportDateName) {
        Date nowDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            switch (exportDateName.getName()) {
                case "секунды":
                        return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / 1000);
                case "минуты":
                        return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / (1000 * 60));
                case "часы":
                        return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / (1000 * 60 * 60));
                case "дни":
                        return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / (1000 * 60 * 60 * 24));
                case "месяцы":
                    return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / (1000 * 60 * 60 * 24*100));
                    default:
                        return null;
            }
        }catch (ParseException e) {
            return null;
        }
    }
}
