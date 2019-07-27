package MathMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println(AreaCircle.go(10.3d));
        System.out.println("Проверка равенства суммы двух чисел и третьего числа:" + IsThirdNumSumFirstAndSecondNum.go("0.1","0.2","0.3"));
        System.out.println("Максимум 3 чисел: " + MaxMin.max(0.15,0.151, 1.5));
        System.out.println("Минимум 3 чисел: " + MaxMin.min(0.15,0.151, 1.5));
    }
}
