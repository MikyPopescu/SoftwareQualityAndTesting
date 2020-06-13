package cts.patterns.miky.client;

public class TestBuilder {
    public static void main(String[] args) {
        Product phone = new Product.ProductBuilder("iPhone X")
                .setDescription("best iphone")
                .setAvaible(true)
                .setPrice(1500)
                .build();

        System.out.println(phone);
    }
}
