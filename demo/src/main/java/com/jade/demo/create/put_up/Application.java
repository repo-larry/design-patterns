package com.jade.demo.create.put_up;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Application {

    public static void main(String[] args) {
        Shop shop = new Shop.ShopBuilder()
                .name("XX水果店")
                .location("福州市XX区XX街XX号")
                .type("水果经营")
                .build();
        System.out.println(shop);
    }
}
