package com.xzh.designpattern.fp;

import java.math.BigDecimal;
import java.util.function.Function;

public class StrategyPattern {

    public static void main(String[] args) {
        System.err.println(Plan.BASIC.deliveryPrice.apply(new Item(1L, new BigDecimal("12.99"))));
    }

}

class BasicDeliveryPriceCalculator implements DeliveryPriceCalculator {

    @Override
    public BigDecimal priceFor(Item item) {
        return item.price().multiply(new BigDecimal("0.025")).add(new BigDecimal("1.0"));
    }
}

class PremiumDeliveryPriceCalculator implements DeliveryPriceCalculator {

    @Override
    public BigDecimal priceFor(Item item) {
        return item.price().multiply(new BigDecimal("0.015")).add(new BigDecimal("1.0"));
    }
}

class BusinessDeliveryPriceCalculator implements DeliveryPriceCalculator {

    @Override
    public BigDecimal priceFor(Item item) {
        return new BigDecimal("1.0");
    }
}

interface DeliveryPriceCalculator {
    BigDecimal priceFor(Item item);
}

enum Plan {
    BASIC(deliveryPriceWithPercentageSurplus("0.025")),
    PREMIUM(deliveryPriceWithPercentageSurplus("0.015")),
    BUSINESS(deliveryPriceWithPercentageSurplus("0.0"));

    private static Function<Item, BigDecimal> deliveryPriceWithPercentageSurplus(String percentageSurplus){
        return item -> item.price().multiply(new BigDecimal(percentageSurplus)).add(new BigDecimal("1.0"));
    }

    public final Function<Item, BigDecimal> deliveryPrice;

    Plan(Function<Item, BigDecimal> deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
}

class Item {

    private Long id;
    private BigDecimal price;

    public Item(Long id, BigDecimal price) {
        this.id = id;
        this.price = price;
    }

    public BigDecimal price() {
        return price;
    }
}

