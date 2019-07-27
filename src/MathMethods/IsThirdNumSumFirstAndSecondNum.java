package MathMethods;

public class IsThirdNumSumFirstAndSecondNum {
    public static boolean go(String numFirst, String numSecond, String numThird){
        double epsilon = 0.0000001d;
       return Math.abs((Double.parseDouble(numFirst) + Double.parseDouble(numSecond)) -Double.parseDouble(numThird)) < epsilon;
    }
}
