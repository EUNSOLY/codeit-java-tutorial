package com.example.demo;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {

        //// 아래 코드는 버퍼 크기 조정하는 방법으로 대용량 파일일수록 큰 버퍼 세팅
        // 기본 버퍼 크기 8192 -> 8KB
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 커스텀 크기 16KB
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"), 16384)) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // 한줄씩 읽다가 파일이 끝이면 null 반환
                System.out.println(line); // 한줄씩 출력
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
//            throw new RuntimeException(e);드
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            bufferedWriter.write("안녕 File I/O야");
            bufferedWriter.newLine(); // 줄바꿈
            bufferedWriter.write("Using BufferedWriter for better performance");
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
