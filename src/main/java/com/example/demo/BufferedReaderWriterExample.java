package com.example.demo;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // 한줄씩 읽다가 파일이 끝이면 null 반환
                System.out.println(line); // 한줄씩 출력
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

        
    }
}