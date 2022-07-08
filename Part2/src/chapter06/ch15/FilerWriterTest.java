package chapter06.ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FilerWriterTest {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("writer.txt")) {
            fw.write('A');
            char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};

            fw.write(buf);  // 문자 배열 출력
            fw.write("안녕하세요. 잘 써지네요");  // String 출력
            fw.write(buf, 1, 2);
            fw.write("65");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}