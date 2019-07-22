package differenceDate.entity;

public enum ExportDateName {
    second("секунды"),
    minute("минуты"),
    hour("часы"),
    day("дни"),
    month("месяцы"),
    year("года");

    private String name;

    ExportDateName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}