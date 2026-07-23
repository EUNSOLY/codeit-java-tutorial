package com.example.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToCsvExample {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();

        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("stock.csv"))) {
            bufferedWriter.write("key, value");
            bufferedWriter.newLine();

            // Map 엔트리 Csv 라인으로 변경
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();

                // 키 정규화
                if (key.contains(",") || key.contains("\"") || key.contains("\n")) {
                    key = "\"" + key.replace("\"", "\"\"") + "\"";
                }
                bufferedWriter.write(key + "," + value);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

