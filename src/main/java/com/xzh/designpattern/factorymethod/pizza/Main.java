package com.xzh.designpattern.factorymethod.pizza;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 15:00
 * @since
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");

        String json = JSON.toJSONString(pizza, SerializerFeature.WriteMapNullValue);
        System.err.println(json);


    }
}
