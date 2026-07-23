package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToListProductExample {

    public static class Product {
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
    }


    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("products.csv"))) {
            String line;
            boolean header = true;
            while ((line = bufferedReader.readLine()) != null) {
                if (header) { // 첫줄은 header 건너뛰기
                    header = false;
                    continue;
                }
                // csv 파싱 -> 콤마 분리
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                int price = Integer.parseInt(tokens[2]);

                products.add(new Product(id, name, price));

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("CSV로부터 로드된 Product List: " + products);

    }

}
