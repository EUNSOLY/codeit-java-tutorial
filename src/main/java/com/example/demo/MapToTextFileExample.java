package com.example.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToTextFileExample {
    public static void main(String[] args) {
        // 메모리에 있는 Map 데이터 (상품명과 재고)
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("stock.txt"))) {
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {

//                bufferedWriter.write("구분자 : 공백");
//                bufferedWriter.newLine();
                bufferedWriter.write(entry.getKey() + " " + entry.getValue()); // 공백으로 구분
                bufferedWriter.newLine();
//                bufferedWriter.write("구분자 : =");
//                bufferedWriter.newLine();
//                bufferedWriter.write(entry.getKey() + " = " + entry.getValue()); // 공백으로 구분
//                bufferedWriter.newLine();
//                bufferedWriter.write("구분자 : JSON");
//                bufferedWriter.newLine();
//                bufferedWriter.write("\"" + entry.getKey() + "\":" + entry.getValue());
//                bufferedWriter.newLine();
//                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
