package com.example.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListProductToCsvExample {


    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("products.csv"))) {
            bufferedWriter.write("id, name, price");
            bufferedWriter.newLine();
            Product[] products = new Product[]{
                    new Product(4, "Carrot", 500),
                    new Product(5, "Potato", 200),
                    new Product(6, "Pear", 10000),
            };

            for (Product product : products) {
                bufferedWriter.write(product.getId() + ", " + product.getName() + ", " + product.getPrice());
                bufferedWriter.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static class Product {
        private int id;
        private String name;
        private int price;

        public Product(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
