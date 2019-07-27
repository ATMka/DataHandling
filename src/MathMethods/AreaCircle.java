package MathMethods;

import java.math.BigDecimal;
import java.math.MathContext;

public class AreaCircle {
    public static BigDecimal go(double radius){
        return new BigDecimal(Math.pow(radius,2) * Math.PI).setScale(50) ;
    }
}
