package MathMethods;

public class MaxMin {
    public static double max(double one, double two, double three){
        return Math.max(Math.max(one,two),three);
    }
    public static double min(double one, double two, double three){
        return Math.min(Math.min(one, two),three);
    }
}
