package com.jade.demo.create.put_up;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Shop {

    private String name;
    private String location;
    private String type;

    public Shop(ShopBuilder builder) {
        this.name = builder.name;
        this.location = builder.location;
        this.type = builder.type;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static class ShopBuilder {
        private String name;
        private String location;
        private String type;

        public ShopBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ShopBuilder location(String location) {
            this.location = location;
            return this;
        }

        public ShopBuilder type(String type) {
            this.type = type;
            return this;
        }

        public Shop build() {
            return new Shop(this);
        }
    }
}
