package restaurant;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class Tea extends HotBeverage{
    public Tea (String name, BigDecimal price,double milliliters){
        super(name,price,milliliters);
    }
}
