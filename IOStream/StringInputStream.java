import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class StringInputStream {
  public static void main(String[] args){
    try(Reader in = new FileReader("data.txt")){  // 문자 출력 스트림 생성
      int s = in.read();
      System.out.print((char)s);
      s = in.read();
      System.out.print((char)s);
      System.out.println();
    }
    catch(IOException e){
      e.printStackTrace();
    }

    try(BufferedReader in2 = new BufferedReader (new FileReader("data2.txt"))){
      String s;
      while (true){
        s = in2.readLine();
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