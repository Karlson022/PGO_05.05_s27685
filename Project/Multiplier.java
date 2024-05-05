package Project;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {
    

    public int multiply(int x, int y){
        return x*y;
    }

    public int multiply(int a, int b, int c, int d){
        return multiply(a, b) * c * d;
    }

    public double multiply(double x, double y){
        return x*y;
    }

    public BigDecimal multiply(BigDecimal x, BigDecimal y){
        return x.multiply(y);
    }

    public int multiply(ArrayList<Integer> x){
        int result = 1;
        for (int number : x) {
            result *= number;
        }
        return result;
    }
}
