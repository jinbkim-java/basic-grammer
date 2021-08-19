import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringOutputStream {
  public static void main(String[] args){
    try(Writer out = new FileWriter("data.txt")){  // 문자 출력 스트림 생성
      out.write('A');
      out.write('형');
    }
    catch(IOException e){
      e.printStackTrace();
    }

    String ks = "아 공부하기 싫어";
    String es = "I hate to study";
    try(BufferedWriter out2 = new BufferedWriter(new FileWriter("data2.txt"))){
      out2.write(ks, 0, ks.length());
      out2.newLine();  // 개행 삽입
      out2.write(es, 0, ks.length());
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}