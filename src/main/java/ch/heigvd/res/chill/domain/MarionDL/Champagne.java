package ch.heigvd.res.chill.domain.MarionDL;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Champagne implements IProduct {

    public final static String NAME = "Champagne";
    public final static BigDecimal PRICE = new BigDecimal(7.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}