import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StringInputStream {
  public static void main(String[] args){
    Path fp = Paths.get("data2.txt");
    try(BufferedReader in = Files.newBufferedReader(fp)){  // 문자 출력 스트림 생성
      String s;
      while (true){
        s = in.readLine();
        if (s == null)
          break;
      System.out.println(s);
      }
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}