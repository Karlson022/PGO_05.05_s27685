package Project;

import java.math.BigDecimal;

public class Adder {
    
    public int add(int x, int y){
        return x+y;
    }

    public BigDecimal add(BigDecimal x, BigDecimal y){
        return x.add(y);
    }

    
}
