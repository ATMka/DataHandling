package service;

import entity.ExportDateName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {
    public Long differenceBirthdayDateAndNowDate (String birthdayDate, ExportDateName exportDateName) {
        Date nowDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        switch (exportDateName.getName()) {
            case "секунды":
                try {
                    return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / 1000);
                } catch (ParseException e) {
                    return null;
                }
            case "минуты":
                try {
                    return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / (1000 * 60));
                } catch (ParseException e) {
                    return null;
                }
            case "часы":
                try {
                    return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / (1000 * 60 * 60));
                } catch (ParseException e) {
                    return null;
                }
            case "дни":
                try {
                    return new Long((nowDate.getTime() - dateFormat.parse(birthdayDate).getTime()) / (1000 * 60 * 60 * 24));
                } catch (ParseException e) {
                    return null;
                }
                default: return null;
        }
    }
}
