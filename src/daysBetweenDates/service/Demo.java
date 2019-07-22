package daysBetweenDates.service;

public class Demo {
    public void go (){
        DateService dateService = new DateService();
        String firstDate = "21.06.2019";
        String secondDate = "23.06.2019";
        System.out.println("Количество дней между датой " + firstDate + " и " + secondDate + ": "
                + dateService.daysBetweenDates(firstDate,secondDate));
    }
}
