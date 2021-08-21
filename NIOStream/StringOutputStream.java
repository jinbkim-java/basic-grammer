import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringOutputStream {
  public static void main(String[] args){
    String ks = "아 공부하기 싫어";
    String es = "I hate to study";
    Path fp = Paths.get("data2.txt");
    try(BufferedWriter out = new BufferedWriter(Files.newBufferedWriter(fp))){  // 문자 출력 스트림 생성
      out.write(ks, 0, ks.length());
      out.newLine();  // 개행 삽입
      out.write(es, 0, es.length());
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}