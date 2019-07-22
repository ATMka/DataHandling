package differenceDate.service;

import differenceDate.entity.ExportDateName;

public class Demo {
    public void go (){
        differenceDate.service.DateService dateService = new differenceDate.service.DateService();

        System.out.println("Количество секунд со дня рождения " +
        dateService.differenceBirthdayDateAndNowDate("01.07.1992", ExportDateName.second));

        System.out.println("Количество минут со дня рождения " +
                dateService.differenceBirthdayDateAndNowDate("01.07.1992", ExportDateName.minute));


        System.out.println("Количество дней со дня рождения " +
                dateService.differenceBirthdayDateAndNowDate("01.07.1992", ExportDateName.day));

        System.out.println("Количество месяцев со дня рождения " +
                dateService.differenceBirthdayDateAndNowDate("01.07.1992", ExportDateName.month));
    }
}
