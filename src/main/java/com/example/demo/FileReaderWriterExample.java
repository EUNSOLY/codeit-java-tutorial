package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("example.txt")) {
            int data;

            // read()는 한 문자씩 읽어서 한 문자의 ASCII/유니코드 값을 반환
            // 파일 끝에 도달하면 -1을 반환
            // n자 파일일 경우 n번 디스크에 접근해야 함
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            // 파일이 없을 때 발생하는 에러
            System.out.println("파일 없을 때 ");
            e.printStackTrace();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            // 입출력을 하는 도중에 발생하는 에러
            System.out.println("IOException");
            e.printStackTrace();
        }

        // 파일이 없으면 자동으로 생성 있으면 덮어써짐
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            String content = "안녕 File I/O--";
            for (char text : content.toCharArray()) {
                fileWriter.write(text);// 한 문자씩 디스크에 씀
                // 매번 디스크 I/O 발생 -> 느린다
            }
            fileWriter.flush();
            // flush() : 버퍼에 남아 있는 데이터를 강제로 파일(디스크)에 기록한다.
            // close() : 내부적으로 flush()를 수행한 후 자원을 해제한다.
            // try-with-resources를 사용하면 블록이 끝날 때 close()가 자동으로 호출된다.
            // try-with-resources : try(리소스 선언) 형태로 AutoCloseable을 구현한 객체를 선언하면,
            //                      블록 종료 시 close()를 자동으로 호출해 자원을 안전하게 해제하는 문법이다.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
